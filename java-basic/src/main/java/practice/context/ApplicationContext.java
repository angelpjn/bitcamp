package practice.context;

import java.lang.reflect.Method;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

import org.reflections.Reflections;

import practice.annotation.Component;

public class ApplicationContext {
    
    String baseDir;
    int startIndexOfPackageName;

    static HashMap<String,Object> pool = new HashMap<>();

    public ApplicationContext() {}

    public ApplicationContext(String basePackage) {
        
        try {
            Reflections reflections = new Reflections(basePackage);
            
            Set<Class<?>> classes = reflections.getTypesAnnotatedWith(Component.class);
            
            for (Class<?> clazz : classes) {
                Component compAnno = clazz.getAnnotation(Component.class);
                if (compAnno == null) continue;
                
                Object obj = clazz.newInstance();

                if (compAnno.value().length() == 0) {
                    pool.put(clazz.getName(), obj);
                } else {
                    pool.put(compAnno.value(), obj);
                }
            }
            
        } catch (Exception e) {
            throw new BeansException("프로퍼티 파일 로딩 중 오류 발생!", e);
        }
    }

    public Object getBean(String name) {
        Object bean = pool.get(name);
        if (bean == null)
            throw new BeansException("빈을 찾을 수 없습니다.");
        return bean;
    }

    public void addBean(String name, Object bean) {
        pool.put(name, bean);
    }
    
    private void injectDependence() {
        Collection<Object> objs = pool.values();
        for (Object obj : objs) {
            invokeSetter(obj);
        }
    }

    private void invokeSetter(Object obj) {
        Method[] methods = obj.getClass().getDeclaredMethods();
        
        for (Method m : methods) {
            if (!m.getName().startsWith("set")) continue;
            
            Object dependency = findObject(getFirstParameterType(m));
            
            if (dependency == null) continue;
            
            try {
                m.invoke(obj, dependency);
            } catch (Exception e) {
                throw new BeansException(obj.getClass().getName() +
                        " 클래스의 " + m.getName() +
                        " 메서드 호출 오류!");
            }
        }
    }

    private Object findObject(Class<?> type) {
        
        Collection<Object> objs = pool.values();
        
        for (Object obj : objs) {
            if (type.isInstance(obj))
                return obj;
        }
        return null;
    }

    private Class<?> getFirstParameterType(Method m) {
        return m.getParameterTypes()[0];
    }

    public void refreshBeanFactory() {
        injectDependence();
    }
    
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
