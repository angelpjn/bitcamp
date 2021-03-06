package java100.app.beans;

import java.lang.reflect.Method;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

import org.reflections.Reflections;

import java100.app.annotation.Component;

public class ApplicationContext {
  
    HashMap<String,Object> pool = new HashMap<>();

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
            
            injectDependency();

        } catch (Exception e) {
            throw new BeansException(e);
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
    
    public String[] getBeanDefinitionNames() {
        Set<String> keySet = pool.keySet();
        
        String[] names = new String[keySet.size()];

        keySet.toArray(names);
        return names;
    }
    
    private void injectDependency() {
        Collection<Object> objs = pool.values();
        
        for (Object obj : objs) {
            invokeSetter(obj);
        }
    }

    private void invokeSetter(Object obj) {
        Method[] methods = obj.getClass().getDeclaredMethods();

        for (Method m : methods) {
            if (!m.getName().startsWith("set")) continue;

            Object dependency = findObject(getFirstPapameterType(m));
            if (dependency == null) continue;
            try {
                m.invoke(obj, dependency);
//                System.out.printf("%s,%s 호출됨!\n", obj.getClass().getName(), m.getName());
            } catch (Exception e) {
                throw new BeansException(
                        obj.getClass().getName() + " 클래스의 " + m.getName() + "메서드의 호출 오류!");

            }
        }
    }
    
    private Class<?> getFirstPapameterType(Method m) {
        return m.getParameterTypes()[0];
    }
    
    private Object findObject(Class<?> type) {
        Collection<Object> objs = pool.values();
        
        for (Object obj : objs) {
            if (type.isInstance(obj))
                return obj;
        }
        return null;
    }
    
    public void refreshBeanFactory() {
        injectDependency();
    }
}































