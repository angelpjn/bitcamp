package codefight.interview.commontechniques;

public class ContainsDuplicates {

    boolean containsDuplicates(int[] a) {

        if (a.length == 0 || a.length == 1)
            return false;
        
        if (a.length < 100000) {
            int temp = 0;
            for (int i = 0; i < a.length; i++) {
                for (int j = i + 1; j < a.length; j++) {
                    if (a[i] >= a[j]) {
                        temp = a[i];
                        a[i] = a[j];
                        a[j] = temp;
                    }
                }
            }
            
            int count = 1;
            for (int i = 1; i < a.length; i++) {
                if (a[i - 1] == a[i])
                    count++;
                if (count > 1) {
                    return true;
                }
            }
        } else {
            int max = -(2 * (int) Math.pow(10, 9) + 1);
            for (int i = 0; i < a.length; i++) {
                max = Math.max(max, Math.abs(a[i]));
            }
            
            int[] acheck = new int[max * 2 + 1];
            for (int i = 0; i < a.length; i++) {
                if (a[i] == 0)
                    acheck[max]++;
                else if (a[i] < 0)
                    acheck[Math.abs(max - a[i])]++;
                else {
                    acheck[a[i] + max]++;
                }
            }
            
            for (int i = 0; i < acheck.length; i++) {
                if (acheck[i] > 1)
                    return true;
            }
        }
        
        return false;
    }
    
    public static void main(String[] args) {
        ContainsDuplicates containsDuplicates = new ContainsDuplicates();
        
        
        int[] arr = {94886, 28821, 20675, 98974, 22621, 91823, 44730, 6160, 99710, 46764, 46571, 55716, 11540, 28266, 73209, 13807, 8993, 18841, 89902, 59175, 90398, 77670, 64665, 40145, 45521, 57445, 49570, 11896, 18068, 67432, 83592, 26821, 58985, 26944, 84818, 54572, 20638, 14656, 206, 70860, 93071, 44055, 96137, 3536, 72607, 78294, 97322, 77146, 57043, 54165, 90341, 61515, 8318, 1711, 80599, 37455, 83277, 24794, 77134, 25009, 148, 21904, 71534, 95227, 96105, 27114, 83113, 5950, 11348, 15844, 75966, 47447, 27051, 8887, 35354, 40231, 70795, 11906, 33565, 86815, 71649, 35906, 75200, 70001, 97367, 42827, 83577, 16687, 27315, 16493, 93667, 91973, 48885, 15583, 17731, 54936, 74874, 82474, 1399, 73080, 13759, 25206, 81472, 58730, 5147, 74013, 21594, 53260, 33459, 91020, 52332, 45901, 84370, 44027, 41557, 4514, 87642, 55924, 75849, 89189, 26048, 20291, 90824, 92839, 97513, 16950, 43040, 26594, 20167, 23935, 14649, 8783, 58112, 80561, 40255, 78519, 92347, 63255, 75073, 65568, 16186, 61602, 19834, 80650, 9385, 78664, 32019, 60731, 13899, 20208, 70056, 83777, 96104, 63008, 28428, 71002, 90604, 5387, 79698, 72818, 31054, 82023, 44135, 71636, 57306, 61287, 80836, 78352, 26708, 92361, 1258, 9380, 19237, 14751, 50478, 23179, 63532, 74961, 23120, 55092, 12115, 91851, 80565, 56438, 85709, 48354, 72609, 5012, 18795, 31209, 87165, 51285, 64547, 8065, 79916, 7191, 42555, 79696, 32996, 81768, 99831, 4296, 3391, 46343, 46169, 83667, 82261, 16701, 49607, 13177, 84668, 80863, 50429, 17661, 25111, 62883, 85121, 5166, 20165, 96894, 20336, 83057, 17487, 14860, 30648, 95509, 43731, 66779, 93877, 73367, 24166, 40222, 31864, 95441, 95535, 82125, 3254, 97102, 82770, 8988, 88462, 43211, 92971, 72981, 99668, 34129, 57079, 21211, 30868, 21811, 56025, 22430, 45446, 50912, 66216, 9681, 55830, 55337, 26974, 36735, 11199, 44191, 49982, 88952, 75899, 39618, 70959, 43710, 35038, 99028, 16974, 55099, 88110, 99690, 43518, 14102, 92178, 25133, 20089, 75483, 90083, 97745, 37093, 88997, 14430, 7903, 9863, 88755, 84324, 55829, 47334, 71219, 1071, 49755, 86000, 50244, 2201, 60494, 23032, 51142, 99486, 21039, 26, 77302, 77269, 60841, 86286, 27067, 73164, 23466, 88895, 84616, 2801, 64765, 27483, 47041, 58079, 69082, 77125, 49639, 49804, 96241, 39149, 56785, 90519, 23878, 9658, 52715, 5072, 8803, 34004, 41310, 97315, 28050, 48619, 7346, 19751, 1464, 3923, 95456, 90198, 69272, 5620, 34983, 62002, 62935, 45350, 48695, 35120, 74875, 2207, 62659, 80166, 35908, 13636, 28085, 75856, 3392, 62001, 63632, 96122, 67688, 16277, 38590, 93712, 20923, 17648, 86759, 90809, 36931, 32366, 4780, 33127, 11201, 47975, 28999, 48991, 95166, 50905, 43349, 32170, 47786, 9799, 93446, 62071, 27764, 63117, 22313, 44442, 73450, 97906, 34777, 7776, 28488, 64337, 11707, 16436, 9761, 88869, 1237, 80695, 5712, 14056, 19962, 15145, 32484, 96756, 60233, 91435, 24296, 94008, 82531, 63250, 39068, 91151, 94056, 48589, 60799, 86399, 6655, 64872, 6791, 14984, 33927, 81207, 61765, 3536, 90393, 41221, 2880, 46373, 60693, 64749, 55793, 3535, 58710, 7558, 40311, 98399, 47243, 76650, 36251, 56600, 79539, 46134, 74501, 94598, 93057, 22775, 93943, 89487, 79413, 56187, 88533, 65041, 64288, 3401, 67054, 18164, 46312, 66417, 37438, 80675, 12205, 26738, 25443, 8223, 21260, 77476, 50088, 29105, 15876, 29132, 38295, 23329, 19159, 45551, 16874, 73756, 91699, 88593, 56626, 54833, 14237, 9589, 81511, 82365, 4548, 2429, 91924, 90951, 90148, 94574, 94550, 16635, 76839, 50011, 96462, 7005, 9411, 58370, 41373, 16958, 45204, 75970, 74899, 34011, 51441, 2152, 6034, 45192, 78304, 38314, 61211, 45393, 5537, 51542, 75963, 67465, 318, 30473, 12180, 91513, 43912, 33359, 29972, 39708, 5609, 85106, 68952, 33443, 7839, 95452, 81302, 48113, 15354, 89574, 98104, 66104, 73498, 74972, 36727, 44770, 71375, 49207, 24210, 89961, 55680, 26565, 86259, 95731, 75775, 61447, 28062, 42928, 60020, 9652, 49379, 80219, 65398, 47498, 58435, 53642, 29577, 87026, 70601, 96681, 11781, 53341, 59487, 13261, 90110, 53030, 72692, 55679, 6961, 23250, 64957, 94372, 30447, 97191, 65184, 97222, 8310, 55646, 66745, 52977, 76074, 18858, 59291, 65391, 82357, 34145, 18758, 24043, 1691, 96034, 4949, 10759, 98999, 14404, 40363, 20247, 58841, 52170, 88047, 32314, 68294, 34348, 27876, 46281, 13069, 4573, 72207, 60591, 5287, 15460, 50907, 39408, 96970, 6034, 67688, 64207, 79986, 21833, 60320, 42015, 60469, 72139, 86018, 32011, 85717, 91166, 547, 34710, 85740, 31455, 40613, 5825, 24889, 13814, 90616, 74881, 51128, 15739, 657, 86497, 40444, 49643, 33315, 85305, 18094, 54601, 40697, 95331, 55470, 50569, 54543, 6857, 34062, 67879, 86638, 85845, 19194, 70020, 19935, 8015, 24146, 89247, 43615, 24258, 10465, 84703, 26558, 55061, 36769, 71771, 51886, 48266, 89068, 40923, 40099, 19900, 21647, 81088, 75420, 64337, 25122, 72638, 59820, 44055, 6076, 71883, 6401, 75145, 49664, 28974, 12076, 27021, 89532, 70272, 99754, 49839, 86995, 50364, 83662, 17437, 19851, 1763, 25200, 90288, 13701, 19760, 95334, 17282, 15850, 24862, 81677, 10776, 87441, 51862, 9663, 50559, 45844, 9643, 68106, 5457, 19011, 50544, 81987, 39733, 79902, 60265, 79403, 36803, 41403, 6437, 95129, 22059, 13041, 17512, 76362, 72439, 28977, 15258, 89593, 85498, 96250, 6351, 97101, 81465, 37159, 79163, 83931, 6091, 45272, 39378, 3213, 54856, 15993, 919, 95594, 42438, 65564, 74955, 40366, 81827, 5324, 14102, 73398, 57362, 91076, 84738, 75322, 5814, 25585, 37927, 57069, 62150, 19536, 25960, 79803, 85137, 25831, 76299, 71675, 82800, 783, 67386, 65056, 88877, 18984, 8130, 47217, 93662, 51960, 87039, 90036, 81931, 2565, 28139, 45951, 83591, 8818, 88179, 22124, 74932, 97374, 96594, 92029, 29147, 67974, 56956, 1257, 3241, 22575, 68651, 39219, 77133, 8295, 10135, 12121, 29737, 25348, 57848, 33924, 40489, 47877, 86592, 29208, 728, 9304, 96925, 69815, 50849, 358, 82091, 54363, 10050, 50253, 33715, 98162, 68062, 43680, 46094, 59718, 64881, 34510, 80982, 40541, 43535, 62938, 61274, 30449, 41155, 18371, 57517, 89708, 63957, 64887, 241, 65755, 60493, 53735, 20997, 20189, 15773, 35736, 3766, 51193, 83243, 17009, 2241, 78142, 87162, 32712, 22541, 95512, 22879, 1945, 6577, 92725, 66947, 17042, 22685, 7362, 86843, 1553, 67957, 55544, 15616, 14618, 39578, 84180, 9941, 95923, 38107, 3913, 64112, 46365, 7644, 90878, 24731, 11369, 28935, 46425, 55522, 19111, 16453, 98208, 22765, 77742, 66660, 76432, 54057, 13733, 57734, 55224, 7650, 87271, 55312, 34506, 65647, 83061, 60819, 61308, 32352, 43536, 77661, 22834, 86321, 51305, 21669, 8, 29705, 18648, 14041, 77445, 61647, 12131, 95537, 47389, 52079, 35442, 45035, 82850, 36748, 5487, 56203, 69095, 29848, 44423, 89064, 34609, 54901, 40116, 22391, 10289, 55191, 27789, 29836, 80514, 42972, 54527, 95690, 9960, 16140, 71904, 86948, 221, 94144, 3166, 71021, 10722, 78429, 44746, 93637, 84312, 958, 49092, 73839, 76531, 10376, 43090, 68327, 81641, 50923, 17081, 44650, 48926, 31732, 32047, 18042, 60375, 37722, 58527, 8042, 51286, 15685, 77020, 84616, 52189, 74586, 52143, 10284, 86846, 1366, 16088, 20145, 19964, 31719, 2949, 77845, 46557, 61803, 67062, 79677, 73750, 69568, 71412, 62240, 64809, 81658, 16113, 95404, 63039, 76514, 17615, 22931, 53316, 5132, 97438, 63533, 60270, 90323, 66966, 13669, 58433, 19585, 97376, 1495, 46880, 26490, 53581, 9279, 62757, 95408, 27163, 56966, 4835, 55823, 65195, 92601, 12584, 16256, 80565, 74039, 38698, 63764, 66610, 893, 3146, 62979, 34698, 26260, 95041, 77563, 70749, 16550, 26024, 70347, 53857, 39025, 64708, 46059, 66243, 15970, 33146, 30404, 74011, 59524, 34975, 6352, 96194, 1921, 61090, 1459, 31386, 39710, 53592, 59405, 9521, 37764, 70049, 21853, 49776, 93525, 86173, 17226, 42236, 91144, 64309, 84105, 65220, 34000, 58118, 61124, 38262, 24463, 90362, 35659, 987, 30604, 38603, 87009, 10172, 26348, 23671, 99692, 71037, 20899, 89224, 72645, 52448, 440, 27868, 63788, 56681, 5933, 28765, 29686, 61704, 58280, 6802, 97498, 52537, 17110, 36510, 95092, 99535, 28848, 59659, 71953, 96347, 39024, 79490, 90446, 87747, 45567, 56316, 20468, 43105, 64579, 27225, 30800, 11095, 72118, 12127, 92266, 34038, 31478, 27258, 63651, 94792, 5468, 30229, 206, 56090, 53637, 52541, 73718, 96600, 52125, 82608, 74278, 87232, 55996, 64261, 55864, 26578, 38219, 10376, 33274, 67348, 12952, 97181, 56253, 36786, 14194, 63589, 44596, 78712, 43953, 16896, 6058, 9349, 84505, 66734, 8646, 19325, 43725, 97741, 12143, 66234, 17219, 62700, 89785, 87529, 51416, 46626, 50771, 93405, 48618, 91011, 25255, 72341, 29898, 29177, 88399, 40486, 32752, 40524, 4665, 21097, 3811, 38485, 38011, 82690, 76471, 75218, 50115, 7572, 62518, 65442, 36068, 39790, 84667, 73800, 75695, 80978, 94931, 55385, 78262, 7385, 81004, 58939, 72139, 15273, 66539, 3064, 11608, 83555, 25152, 91595, 49103, 10808, 77171, 7206, 37251, 97015, 84662, 47762, 71841, 64959, 4979, 76748, 90220, 72400, 86528, 72076, 83359, 41382, 92622, 58193, 9683, 6177, 59346, 53403, 47150, 71323, 45698, 18253, 51047, 62516, 80972, 15130, 43592, 89541, 52122, 59445, 28285, 34453, 50324, 11973, 96623, 80986, 18621, 23510, 14423, 56982, 62957, 13127, 74913, 81544, 44206, 42843, 10211, 97221, 32306, 26265, 95902, 86342, 65364, 95179, 9172, 29217, 47898, 66303, 91903, 68452, 82562, 86044, 24645, 19789, 28717, 33740, 21150, 22884, 9898, 97424, 40388, 88932, 17427, 10365, 41392, 4615, 56602, 59463, 40684, 98113, 13702, 59401, 43655, 42194, 8564, 30176, 90150, 5952, 28636, 7189, 69460, 54236, 24668, 70928, 44264, 16782, 3232, 56739, 39842, 76936, 97873, 29221, 99845, 77494, 87618, 28618, 70449, 69773, 86935, 78988, 87580, 8312, 37073, 14476, 18403, 8078, 1329, 64992, 35854, 78082, 15936, 93852, 45384, 87382, 11320, 44482, 23882, 89084, 25173, 31726, 59986, 14008, 71595, 2170, 83734, 73196, 30805, 53039, 33063, 6596, 24813, 63764, 4081, 73569, 20613, 17004, 28085, 99091, 10574, 24300, 52287, 76792, 78946, 70058, 75543, 94659, 29319, 12424, 63849, 73268, 51385, 25759, 41297, 85099, 8534, 67224, 3863, 82334, 25716, 73746, 61027, 65186, 27628, 70147, 52563, 75820, 78520, 25770, 64351, 50032, 3179, 47357, 13237, 31347, 74902, 59906, 75250, 6382, 25430, 18978, 71433, 11978, 82240, 29420, 17948, 99909, 58684, 13646, 71799, 74790, 9194, 5645, 94912, 44094, 4033, 9169, 59938, 91950, 46938, 27045, 72983, 21688, 45649, 28353, 10483, 56846, 32607, 64630, 45000, 82383, 23597, 92597, 80409, 150, 33909, 41105, 15483, 68715, 11372, 93579, 27317, 56367, 61743, 96085, 58571, 38755, 77824, 86404, 44720, 78912, 24733, 2799, 99081, 91440, 92934, 44998, 46097, 57543, 13046, 64066, 11514, 44400, 2877, 2912, 65501, 10013, 92212, 75779, 19857, 204, 22672, 74694, 79175, 93791, 69436, 39541, 49964, 98515, 64861, 72382, 83390, 20010, 83568, 10148, 25270, 32786, 73054, 95320, 99354, 36186, 87047, 36983, 92548, 95379, 63048, 60152, 80984, 94567, 79854, 52889, 64731, 86737, 46787, 91737, 8904, 44676, 38211, 40210, 64106, 45439, 91032, 99308, 32743, 25766, 44512, 94773, 28011, 42565, 62993, 27913, 28230, 62256, 36786, 51521, 18135, 44306, 99560, 11249, 80433, 77902, 76552, 2864, 40489, 91902, 73273, 48957, 86937, 96633, 94380, 87680, 55828, 63727, 8378, 10010, 35110, 16641, 55794, 63227, 60404, 39331, 71345, 62553, 94954, 58777, 54282, 86874, 96755, 7133, 68636, 28159, 60508, 3236, 1626, 90479, 29245, 6366, 7791, 2380, 22970, 8512, 52411, 96913, 51898, 3659, 98813, 60996, 90404, 21511, 9539, 53252, 8690, 7988, 4330, 60866, 53618, 13743, 35131, 97071, 37390, 96020, 20072, 6343, 16839, 3111, 84514, 20203, 10029, 66505, 19831, 37801, 31678, 211, 54682, 7319, 38323, 72886, 92064, 34727, 58317, 55886, 51356, 63661, 14661, 52192, 5592, 86142, 21758, 9171, 25143, 76064, 27917, 35934, 42761, 54977, 32280, 92231, 38038, 72538, 94217, 70878, 89444, 36539, 91677, 46867, 78170, 27481, 31990, 52217, 22030, 43563, 45554, 68074, 38865, 72925, 89190, 513, 58017, 35792, 15275, 98090, 17176, 78199, 96125, 62062, 63467, 68830, 47806, 7851, 10258, 77901, 38835, 28587, 78493, 99983, 46717, 73343, 69163, 10365, 88769, 86960, 78374, 39942, 68143, 29135, 64339, 79700, 25541, 36325, 46453, 57322, 39252, 10740, 90004, 21198, 71731, 72936, 79742, 23235, 66630, 43521, 60641, 43562, 31853, 57034, 66206, 43633, 49684, 59536, 43946, 80997, 52665, 21448, 41474, 29257, 81561, 77844, 36881, 63350, 72241, 51053, 55563, 48230, 89892, 77768, 92998, 56172, 31397, 76353, 41664, 1926, 84580, 82567, 76279, 73642, 19109, 98336, 34988, 64099, 44019, 33880, 71165, 59305, 50224, 92895, 14898, 30357, 8986, 907, 54425, 23054, 71120, 1455, 44330, 15345, 34738, 26481, 31021, 45334, 40763, 16067, 37679, 21434, 15351, 70341, 97278, 61055, 57462, 36795, 72500, 62011, 57062, 29152, 92259, 20476, 59897, 94154, 71633, 14107, 62390, 88122, 32848, 1011, 49712, 96997, 32872, 84440, 42450, 15427, 90373, 28095, 219, 22257, 20570, 17259, 31780, 55541, 2911, 45397, 8894, 67125, 50141, 15169, 12638, 22127, 25073, 19313, 30180, 26823, 51296, 944, 86646, 1288, 73442, 75497, 89199, 37849, 619, 59934, 44113, 31245, 87827, 70451, 40595, 90205, 23702, 22154, 97792, 37344, 39539, 9579, 31050, 96037, 52187, 98948, 27370, 5211, 53614, 47936, 32032, 65853, 64047, 92642, 72527, 12691, 47457, 54802, 83200, 11736, 46876, 4501, 98130, 55220, 55710, 61152, 93853, 13296, 85805, 91362, 38001, 71780, 46094, 75914, 16167, 1789, 66124, 71091, 29626, 29737, 38042, 70307, 47785, 10790, 34021, 94584, 33273, 60368, 17547, 42024, 58677, 99209, 93549, 85154, 21498, 40174, 4878, 46546, 58081, 38172, 81168, 88365, 17909, 33202, 54845, 69005, 92781, 5847, 96888, 89422, 34542, 83441, 45932, 17365, 20362, 91347, 14693, 67611, 2633, 67677, 10964, 59918, 89870, 44710, 12809, 81433, 42589, 88175, 14010, 46702, 44986, 91051, 61376, 40830, 38130, 26524, 63446, 93827, 69289, 56497, 84322, 10458, 85201, 11660, 27122, 43722, 38176, 93990, 36087, 82914, 2773, 20165, 96942, 15016, 70230, 11112, 23618, 79536, 56477, 35362, 36816, 36069, 72165, 82101, 60656, 60890, 68421, 28574, 48199, 75024, 76795, 44883, 61702, 54671, 59617, 61253, 86452, 77551, 21627, 29200, 26369, 86402, 37506, 76435, 77164, 69449, 87990, 63504, 97374, 61182, 75889, 46990, 60724, 83974, 22441, 12091, 75915, 17121, 18757, 69605, 98667, 51527, 36362, 58587, 51867, 92533, 86666, 92716, 11145, 42938, 19923, 76199, 74786, 80630, 54352, 62138, 45798, 6729, 88218, 2001, 31756, 61495, 53735, 49014, 61025, 79809, 33990, 10611, 76054, 41502, 87614, 40453, 72720, 65208, 84825, 41907, 81505, 40640, 69306, 46153, 19562, 47924, 27580, 39415, 47439, 405, 32739, 82505, 67169, 69086, 69185, 48901, 94131, 13974, 66477, 16413, 67255, 85260, 90084, 96894, 50683, 24266, 87641, 34138, 74830, 36671, 15171, 66880, 29905, 75295, 68975, 24676, 15819, 64476, 33118, 30950, 85516, 76392, 8799, 75090, 92756, 36404, 16932, 97990, 77356, 84158, 28914, 35716, 40483, 15406, 24964, 43345, 49903, 66815, 49399, 27594, 28282, 19916, 94433, 34583, 39665, 81308, 74580, 76330, 92073, 45763, 88886, 21592, 61251, 38519, 11698, 98332, 46780, 21826, 82498, 26045, 79950, 31282, 62454, 46805, 61049, 28826, 62052, 29114, 78622, 80938, 10091, 64734, 15938, 87909, 53578, 78158, 9431, 70717, 29434, 87162, 44386, 1376, 67563, 39701, 16876, 99310, 50084, 68720, 16780, 33171, 29955, 63949, 81895, 66219, 60675, 55003, 32925, 78091, 36961, 28081, 82258, 30355, 29978, 74959, 49066, 75186, 93214, 74961, 92881, 80448, 40187, 89389, 14647, 63072, 13228, 43976, 23254, 30086, 45551, 51997, 93197, 39966, 30370, 76473, 35591, 46097, 63556, 40522, 88854, 46480, 62196, 47158, 3982, 95769, 1394, 92450, 88392, 7748, 94097, 37447, 242, 56903, 94835, 45086, 94537, 68042, 95828, 54641, 36501, 65037, 96149, 36319, 87463, 49505, 19296, 24989, 61110, 35177, 64680, 18325, 95086, 57633, 16516, 70640, 83863, 76546, 16954, 70883, 91825, 13629, 31350, 33221, 6758, 18744, 73624, 61408, 3297, 41923, 82762, 27939, 67405, 52579, 21622, 88645, 63401, 23005, 35708, 23625, 33449, 80479, 96272, 54523, 29548, 85734, 33145, 44754, 59129, 1036, 83195, 51313, 51798, 40378, 92216, 59739, 9511, 39475, 11585, 20186, 49776, 84143, 99409, 7481, 34065, 55001, 9166, 79027, 32742, 6735, 11752, 4595, 29076, 27981, 93339, 32848, 33855, 16810, 56290, 42523, 94687, 67090, 10982, 38684, 43606, 45236, 48276, 4783, 55470, 15660, 30143, 76858, 74006, 21966, 83246, 72999, 27467, 46896, 20867, 44851, 17319, 48634, 85303, 75849, 54656, 85762, 62369, 27779, 91798, 11112, 77766, 38597, 94130, 63435, 43953, 51718, 49076, 6089, 12519, 1291, 85307, 66154, 52726, 4408, 15461, 81840, 44567, 38442, 46935, 48009, 14627, 14935, 20573, 91792, 4924, 68984, 72117, 81516, 90965, 44493, 88509, 47580, 26147, 75980, 94080, 93685, 65772, 37823, 82204, 43885, 79412, 95448, 89548, 12704, 1670, 42617, 59498, 22640, 45538, 23790, 15658, 28941, 58996, 24658, 96432, 1291, 26477, 69897, 22130, 24456, 91556, 14790, 20778, 13159, 70189, 54116, 28695, 35048, 94982, 52812, 10071, 6216, 53382, 82801, 47004, 5816, 760, 7760, 90316, 2001, 57200, 86699, 64073, 56247, 9087, 4632, 37274, 85750, 64599, 63705, 44345, 68442, 33457, 17535, 12036, 68316, 11275, 37484, 49509, 20073, 22316, 49295, 36018, 75512, 18813, 65156, 13112, 20593, 31591, 77314, 257, 87290, 62679, 13465, 60481, 35552, 80, 32574, 77068, 3466, 82992, 72273, 91123, 57797, 66173, 76032, 13096, 57796, 13329, 19256, 69892, 43980, 66223, 69739, 16512, 61991, 68911, 95173, 28945, 85372, 23520, 28371, 35109, 16264, 33537, 21620, 89352, 67610, 89376, 75159, 4712, 84309, 20650, 30458, 9046, 66809, 11025, 38146, 76619, 10667, 47240, 62717, 435, 5517, 1434, 20655, 59563, 76951, 18125, 34939, 32909, 16225, 19316, 5516, 62851, 57915, 22516, 28930, 16668, 38275, 84919, 2799, 82546, 1532, 97130, 73184, 81250, 59252, 33786, 95572, 83886, 90015, 2671, 64173, 41011, 90280, 2416, 33773, 10794, 75804, 69134, 26862, 78983, 19077, 13769, 87358, 57264, 58097, 4460, 97342, 15424, 21846, 50025, 16361, 51910, 23195, 43525, 14398, 48186, 93470, 82770, 41837, 33107, 53408, 93821, 69834, 24681, 612, 8342, 99767, 45131, 48359, 21873, 38299, 60049, 86331, 2912, 50544, 35949, 95029, 89755, 17554, 70105, 76666, 54226, 37449, 39112, 46391, 10465, 20279, 96507, 85782, 42535, 71654, 56731, 91717, 11045, 47367, 22964, 84419, 41660, 64524, 4984, 44839, 48152, 88590, 51298, 3860, 21413, 76156, 90759, 13077, 17622, 56267, 65306, 40097, 89302, 48603, 69066, 86114, 89402, 34389, 13343, 32100, 49068, 26706, 90867, 80645, 27912, 75424, 16986, 81571, 41527, 62768, 74584, 55147, 88647, 4682, 35647, 81472, 99607, 37710, 16710, 78035, 80377, 3479, 83956, 74096, 96182, 82455, 65012, 16490, 30258, 56160, 6607, 32798, 45661, 49636, 84528, 10621, 40681, 5497, 33578, 80556, 20481, 42535, 39994, 31053, 54190, 47356, 29484, 27366, 17253, 30047, 92629, 75093, 8944, 44307, 42253, 95764, 66209, 32561, 44685, 10316, 20252, 45123, 76416, 84500, 54097, 87393, 8698, 82302, 44531, 99126, 88033, 49628, 33855, 46269, 78498, 68450, 72917, 4619, 54258, 43614, 58251, 53474, 57956, 19077, 37518, 64011, 89329, 64068, 92357, 66335, 55857, 57659, 6911, 23744, 77580, 66439, 94272, 2930, 2070, 93916, 16443, 19248, 25628, 79005, 42222, 97144, 73088, 5345, 89683, 27303, 83529, 56344, 88494, 73145, 52456, 40592, 19678, 81668, 93116, 31763, 21274, 31532, 41890, 5547, 41500, 51565, 42907, 34054, 59697, 80584, 89869, 62384, 26302, 31579, 47803, 41851, 21756, 72189, 98472, 37351, 43989, 45393, 68539, 13129, 78916, 70282, 31716, 21808, 25579, 16221, 75380, 76998, 92677, 8696, 91658, 47921, 96613, 20773, 32636, 85459, 54155, 48933, 89189, 50271, 95045, 45262, 59929, 98274, 88714, 99588, 52326, 76696, 28646, 2019, 39722, 52526, 61552, 32636, 78242, 53062, 35195, 15634, 31761, 10535, 68198, 45820, 86510, 66136, 23976, 36383, 63450, 27463, 96287, 77764, 76999, 75538, 13321, 6793, 29102, 32394, 85323, 16305, 40565, 86839, 26336, 60262, 61743, 73875, 82843, 16984, 84084, 31378, 84463, 68501, 51768, 76928, 18022, 24485, 37488, 29194, 79072, 99979, 22405, 27161, 57689, 33476, 30770, 1220, 40726, 50007, 94327, 9850, 62695, 42897, 90110, 8898, 97520, 21883, 73062, 43609, 92992, 61316, 21613, 87371, 50624, 46624, 46647, 18445, 41062, 57759, 25893, 58729, 54552, 9601, 53621, 2481, 55882, 78158, 99249, 70185, 27446, 44262, 15029, 28846, 64399, 28411, 52243, 53894, 9699, 91297, 74838, 55490, 87153, 66140, 56749, 13655, 71695, 1738, 84492, 16839, 62341, 89683, 71673, 94268, 45834, 50499, 39031, 25759, 32565, 8566, 86755, 53131, 28088, 14717, 31208, 18233, 30539, 7309, 60890, 18583, 73106, 94014, 33762, 32005, 44337, 68992, 15053, 25517, 20034, 56050, 20044, 20677, 19200, 6384, 23851, 2609, 80804, 52266, 76340, 2133, 49475, 40895, 8037, 61255, 55850, 12989, 60500, 7859, 22472, 79520, 61213, 24006, 70427, 85285, 84622, 95602, 28501, 6419, 67782, 73277, 82255, 43945, 90685, 21103, 34446, 43195, 44838, 60045, 38962, 36321, 83676, 50457, 97307, 61183, 7980, 22076, 40188, 12668, 8183, 24736, 47167, 41865, 4443, 62359, 96197, 28104, 84856, 59201, 88771, 51115, 90446, 5721, 31456, 16205, 26321, 10776, 64, 48495, 21295, 16664, 48155, 18961, 41049, 2727, 93330, 9462, 91584, 92510, 1080, 97993, 55278, 9490, 35248, 4377, 81801, 2180, 73265, 10295, 54041, 98790, 49321, 31476, 99201, 46431, 10914, 43658, 55768, 27635, 55296, 79828, 20473, 82138, 75464, 53101, 38671, 97220, 62118, 82996, 3353, 2085, 96168, 34147, 11358, 54222, 20620, 49135, 82622, 51473, 31784, 91098, 51872, 17799, 37449, 30579, 90611, 63317, 90767, 27771, 58213, 28056, 16220, 36217, 54910, 58749, 78696, 31930, 7411, 92740, 50979, 53221, 58161, 38755, 45952, 91814, 21860, 70294, 18295, 29948, 35001, 73939, 73118, 56970, 9293, 75265, 71626, 14797, 59481, 25792, 24432, 68968, 60035, 5014, 54190, 38463, 13693, 90222, 67314, 64858, 42347, 89221, 37059, 1900, 5071, 99464, 14545, 65737, 89680, 14112, 21835, 15559, 49307, 94259, 44844, 76354, 40553, 26333, 38799, 70276, 44558, 78763, 57852, 40894, 34369, 85346, 69640, 92491, 67120, 81583, 26345, 49820, 73144, 16822, 39310, 66526, 71859, 40297, 28035, 37934, 32772, 15144, 21735, 84494, 88316, 41159, 14017, 83138, 77124, 95158, 16412, 70373, 61835, 66046, 80075, 11588, 9057, 6699, 3800, 19342, 83909, 31765, 52729, 23392, 25229, 61240, 22002, 33401, 68613, 56059, 60410, 99894, 45803, 51523, 56154, 23099, 74262, 7881, 84376, 82518, 91625, 60102, 5532, 85462, 70881, 87367, 25128, 94799, 55400, 73638, 92234, 34742, 92543, 49853, 35753, 71241, 10336, 32941, 7428, 4701, 82563, 71623, 81796, 38224, 3769, 45559, 89022, 48926, 2823, 96958, 22352, 22918, 74482, 57499, 76878, 37240, 87325, 79134, 4181, 61144, 42061, 8868, 53183, 64616, 13316, 97319, 30420, 30951, 14869, 6562, 36852, 10408, 78048, 56082, 89418, 37781, 65115, 71239, 87878, 20705, 63552, 87868, 80319, 18381, 47681, 21919, 88727, 90567, 30813, 54509, 57450, 59778, 79316, 31386, 87141, 1817, 90225, 82730, 20413, 23136, 55511, 70491, 29380, 89615, 59669, 30440, 86197, 69784, 40296, 47845, 58460, 75726, 90753, 90246, 37368, 46834, 28791, 59712, 10565, 77512, 89262, 93133, 49288, 9025, 44566, 48412, 7570, 16574, 57107, 72144, 99082, 59607, 7491, 21190, 4456, 78360, 55828, 84102, 69870, 10959, 36069, 99319, 12981, 41492, 55813, 79902, 45509, 28611, 43879, 36691, 89001, 9186, 7815, 86995, 66715, 13193, 27331, 67105, 44822, 97982, 66566, 41029, 68459, 97733, 27709, 2744, 29528, 84314, 88997, 50661, 91543, 12978, 43859, 49306, 98471, 50280, 47123, 20811, 37093, 88187, 96930, 78963, 41277, 77569, 45783, 2396, 34687, 30591, 3571, 67285, 83136, 98573, 894, 33291, 23440, 16500, 33347, 14671, 60348, 77790, 26783, 93170, 27222, 17372, 27504, 19609, 92530, 28290, 30069, 4891, 20439, 74404, 78704, 7299, 91177, 20157, 28713, 32124, 5615, 72047, 28481, 20455, 8811, 7601, 7966, 22388, 42599, 46320, 11606, 4645, 44730, 70544, 9665, 96738, 35611, 24268, 26219, 96391, 91012, 84171, 30634, 26484, 31806, 75890, 41102, 52729, 96249, 22829, 72261, 60532, 23917, 99044, 76827, 46460, 44385, 17217, 68276, 25706, 17714, 61509, 7342, 5777, 27689, 18498, 20293, 2651, 37493, 50430, 82856, 21776, 8059, 1832, 61677, 30178, 29530, 32926, 2934, 30439, 44384, 54934, 99367, 10369, 60883, 48411, 5371, 34407, 68756, 32766, 63274, 72044, 6857, 95884, 30696, 47926, 33589, 68315, 59098, 4032, 24401, 7101, 87601, 26945, 67071, 46877, 16470, 43844, 45992, 5352, 97681, 90593, 27716, 84389, 16943, 2245, 97180, 38159, 75923, 25990, 25010, 36367, 85375, 79739, 87922, 51519, 4662, 49094, 40536, 76806, 97221, 96006, 40273, 53557, 48283, 7239, 97147, 9512, 219, 2053, 14875, 9332, 23233, 49630, 51974, 32895, 29954, 95748, 41863, 77037, 29368, 85192, 77908, 94704, 24760, 34351, 84335, 83070, 5875, 24476, 44019, 30791, 11132, 8992, 44297, 31422, 31474, 77682, 27368, 62590, 67070, 60540, 63887, 69744, 45700, 97497, 33358, 4318, 29653, 5178, 56171, 17865, 42293, 39723, 2106, 69375, 80615, 98613, 71533, 10421, 9929, 5203, 75915, 70395, 71733, 54793, 1006, 4038, 17275, 74709, 19852, 91853, 49246, 64757, 53148, 77979, 97738, 84888, 14240, 45990, 50240, 73738, 98578, 61971, 41825, 11805, 60066, 54267, 56061, 57862, 4297, 96780, 204, 35261, 32769, 2396, 63916, 1818, 15739, 65046, 54193, 98444, 31217, 55617, 59791, 97263, 55132, 92918, 78667, 66535, 78207, 53463, 82704, 63977, 29879, 9913, 11901, 23347, 51597, 90724, 78684, 86280, 72816, 69487, 10272, 45867, 94626, 34817, 7325, 81313, 23286, 96192, 97835, 27277, 58226, 96019, 53005, 2276, 86565, 89455, 97931, 87926, 93245, 14388, 25392, 67813, 91854, 40439, 66547, 64661, 30630, 79865, 34659, 31356, 5899, 76351, 9676, 36051, 66399, 67156, 50847, 14328, 75579, 12280, 6662, 16582, 83966, 94498, 17388, 17377, 3235, 41238, 61166, 31103, 94837, 3808, 27627, 57490, 43328, 35952, 42354, 68883, 55795, 24396, 92871, 78173, 28242, 47338, 48084, 88337, 1162, 85502, 44421, 7033, 46893, 24738, 4032, 91031, 84000, 46055, 45147, 13784, 35712, 95992, 83666, 5001, 15200, 69900, 18326, 78793, 29820, 97477, 55076, 52609, 80062, 44666, 10551, 89295, 65333, 35954, 11532, 45870, 17629, 31218, 7354, 56442, 39717, 99527, 59094, 54164, 95157, 34637, 34433, 13697, 83250, 38711, 55279, 80766, 299, 89278, 79617, 30775, 72945, 80655, 11907, 42415, 13334, 84811, 1651, 73388, 94561, 24735, 18872, 84731, 98251, 29763, 48690, 13464, 6582, 87437, 48807, 89924, 82572, 19056, 76987, 84937, 68153, 27094, 83622, 86980, 46527, 16885, 3004, 22509, 48128, 24480, 1177, 34763, 51519, 41698, 14259, 93034, 21991, 95386, 48901, 18157, 94791, 27633, 75092, 34390, 56536, 88197, 55098, 33543, 63363, 7733, 44913, 86348, 1779, 21410, 7135, 13192, 23608, 1257, 13943, 72657, 74792, 90951, 61887, 7968, 33711, 15214, 5705, 83446, 15824, 18294, 25206, 16632, 19389, 26900, 35208, 33842, 36486, 22665, 40129, 29929, 45523, 81960, 22453, 62918, 14553, 94043, 7442, 30771, 87384, 37539, 85162, 15662, 56126, 83867, 40134, 63672, 74553, 52594, 50294, 75657, 64765, 40906, 84688, 31914, 31050, 49480, 35253, 65873, 81226, 79910, 65195, 77792, 2327, 29017, 50263, 51919, 45434, 7720, 45787, 8012, 27499, 47067, 77962, 13751, 68633, 97272, 60950, 19938, 91557, 14241, 10172, 98606, 76995, 49135, 8837, 51408, 44791, 76549, 42581, 92816, 50519, 54881, 87440, 10898, 57076, 22563, 32440, 62801, 28878, 60610, 29553, 97272, 35078, 4970, 82238, 75932, 22321, 80592, 65927, 93522, 83098, 66053, 17807, 44500, 92796, 39416, 1622, 7941, 13703, 69118, 79157, 43872, 72821, 77463, 82902, 17063, 94674, 36062, 24309, 77961, 12551, 75971, 51307, 74721, 30036, 33125, 26104, 73797, 33878, 77478, 17304, 58495, 79720, 64762, 43008, 18077, 82800, 79183, 1693, 99174, 78926, 47476, 75015, 2593, 50840, 8626, 9604, 26394, 13141, 9772, 45089, 85330, 1972, 35160, 82760, 56966, 47473, 92430, 10656, 8494, 42634, 17345, 99655, 5325, 90951, 71426, 50669, 80008, 85311, 95956, 75252, 76188, 19162, 761, 9883, 38276, 62037, 99128, 51377, 71476, 65378, 92514, 71431, 40919, 76155, 64161, 44221, 5835, 30087, 10210, 66979, 9686, 88768, 88184, 41949, 12404, 38126, 89168, 60098, 65033, 38428, 46653, 32450, 38245, 96569, 96627, 89868, 47835, 90432, 2031, 58078, 50678, 13740, 67633, 29143, 39317, 1262, 85359, 21708, 20604, 74569, 20571, 36822, 96616, 80842, 19230, 93066, 35425, 11863, 6172, 50643, 97878, 20786, 24318, 54600, 61745, 63862, 85401, 7976, 23496, 33946, 76103, 18412, 83155, 86211, 53599, 4821, 73932, 91809, 24737, 21561, 40544, 11908, 21945, 87179, 31791, 99472, 21476, 10570, 37132, 23397, 49585, 48499, 76142, 68308, 61271, 94636, 16556, 57962, 45069, 29356, 84846, 56800, 2702, 22381, 9514, 88304, 64831, 65628, 13913, 18581, 61032, 94852, 36035, 12123, 10014, 14701, 67244, 58699, 58945, 8301, 55521, 7056, 63937, 69369, 56700, 1513, 7152, 11453, 93880, 36675, 27606, 27179, 95691, 30601, 50034, 30804, 65571, 7395, 82048, 91408, 5266, 94524, 83602, 56280, 88984, 91180, 15709, 86507, 54778, 14021, 5829, 41007, 61563, 64954, 20150, 87772, 6192, 36023, 5878, 74923, 53619, 40491, 245, 95179, 71068, 28125, 85940, 88094, 49426, 64793, 70971, 26799, 86427, 4930, 52414, 38837, 10892, 32903, 18373, 15555, 68212, 87478, 584, 37725, 47954, 87946, 68449, 64145, 27770, 23887, 38960, 91008, 26789, 44839, 52917, 43932, 72972, 71163, 42887, 4316, 64163, 83692, 61604, 52650, 15942, 96171, 98519, 49549, 6301, 98953, 87052, 11939, 7604, 26714, 2394, 7340, 95418, 884, 5665, 72049, 26958, 18787, 97340, 96299, 156, 93524, 85497, 95876, 67974, 98262, 19735, 1454, 68863, 70020, 84251, 2333, 70896, 85945, 90629, 89974, 57415, 82502, 100, 77602, 93767, 98223, 37350, 23812, 73602, 50221, 16234, 83899, 38082, 88169, 78652, 16788, 94620, 73825, 31075, 27279, 58863, 18030, 95572, 88083, 68395, 62768, 35777, 61881, 94914, 1566, 8663, 42195, 78609, 92199, 76457, 97219, 48908, 3668, 95121, 37530, 56098, 66204, 19946, 61540, 89553, 85574, 94962, 75236, 65151, 83618, 9670, 24671, 37339, 67516, 65941, 63482, 82295, 91319, 52291, 80553, 85348, 8355, 37763, 9885, 83078, 40129, 43840, 24917, 42949, 48701, 92927, 88168, 22923, 76920, 71102, 18950, 53582, 72500, 97236, 42086, 58526, 22493, 62794, 4209, 32204, 46342, 89408, 6434, 62893, 46974, 63977, 17174, 17802, 92476, 48334, 58030, 76440, 85678, 75654, 5989, 49170, 5174, 17807, 95920, 91160, 97567, 45567, 86454, 24410, 18172, 49486, 91534, 26178, 39641, 79251, 97822, 41089, 46034, 96169, 41325, 26334, 80837, 60720, 38837, 14289, 15959, 82168, 78232, 51322, 4292, 93786, 24741, 14212, 84362, 55502, 85874, 27479, 77474, 75703, 92892, 57879, 24881, 9398, 8125, 86853, 16396, 10462, 96281, 91553, 692, 33996, 58343, 43204, 30342, 42219, 89910, 37235, 47816, 19834, 82253, 42944, 35337, 79107, 33467, 58625, 28483, 32526, 64295, 75315, 7486, 89931, 73851, 3438, 17915, 82315, 52435, 7571, 46117, 63137, 45471, 83047, 29328, 54222, 83577, 44841, 72604, 28418, 29210, 84445, 26409, 78534, 25313, 92654, 19652, 98486, 4048, 35380, 73164, 72123, 24195, 41419, 75067, 99821, 72651, 72149, 21650, 12142, 96561, 32633, 10154, 73410, 17501, 69191, 28391, 62064, 37468, 99143, 89932, 3331, 55710, 18959, 65978, 14145, 53403, 27562, 77047, 95161, 10697, 11197, 98357, 68084, 75347, 11592, 85047, 14105, 22948, 35970, 50407, 79784, 40887, 27636, 78224, 45657, 39565, 65594, 2041, 24505, 34600, 83751, 92652, 53071, 60930, 53288, 83195, 78475, 46774, 57869, 79157, 46559, 18468, 24905, 37260, 64322, 48473, 36671, 19097, 75378, 95271, 90233, 38892, 62484, 4227, 86413, 56560, 36007, 84595, 30493, 24197, 17786, 64779, 34573, 51040, 73902, 45929, 74912, 93816, 60926, 50357, 1160, 64603, 59288, 94618, 51121, 50095, 67635, 88586, 72090, 62810, 2032, 13385, 61896, 20764, 58505, 98467, 52210, 8834, 38929, 20889, 1163, 6939, 17901, 59288, 15248, 66800, 9502, 35024, 52113, 66912, 97783, 68240, 65633, 70795, 75753, 37370, 90414, 26581, 80799, 44078, 10177, 88793, 48829, 63392, 91047, 34007, 87389, 74612, 64578, 46523, 43959, 43669, 8570, 49720, 12844, 72169, 61832, 57391, 46957, 53469, 25655, 6273, 23185, 71655, 44553, 68912, 26170, 26524, 54282, 40697, 85580, 4238, 72362, 66148, 7701, 84490, 97771, 82582, 98750, 52503, 42629, 7195, 6499, 16096, 81673, 90867, 72639, 63277, 51004, 2726, 45156, 27752, 63718, 14059, 54037, 31601, 36661, 55659, 18617, 7770, 50951, 82238, 33129, 67995, 4869, 32215, 82578, 42294, 61359, 38004, 2359, 61975, 23908, 59867, 35182, 19532, 6630, 93776, 95931, 21664, 48052, 86217, 29363, 89582, 52617, 76610, 74927, 18402, 56760, 26860, 73160, 93135, 79987, 44450, 61961, 79534, 94261, 38136, 47374, 40534, 62103, 20009, 89874, 90033, 57220, 60021, 52187, 61002, 460, 85976, 60427, 42816, 38129, 94957, 22876, 28904, 67377, 70277, 86999, 30416, 87912, 80150, 74602, 53532, 17257, 70390, 86809, 1593, 2573, 62595, 74698, 88246, 71820, 58009, 4161, 36281, 86945, 52672, 84494, 5784, 58512, 71335, 2254, 38306, 53708, 75234, 59316, 39321, 33203, 9974, 50716, 87516, 39053, 16783, 64290, 75491, 84727, 67161, 59285, 534, 55548, 776, 48017, 48084, 85511, 85890, 50423, 65176, 63332, 19246, 33571, 68281, 18014, 25391, 91622, 9594, 32863, 89122, 65711, 75188, 43638, 7571, 59276, 15598, 8990, 32286, 363, 68682, 41587, 86216, 49234, 53941, 1698, 61936, 98102, 10550, 61482, 35402, 44994, 97462, 52927, 40509, 23386, 43153, 53700, 41537, 37946, 21378, 72862, 44959, 24829, 48330, 71616, 3645, 4, 89130, 29197, 60197, 87837, 66294, 30666, 53401, 56652, 38533, 41279, 37540, 44577, 52915, 70673, 76308, 39539, 53152, 75306, 82647, 48910, 99928, 38568, 8224, 40056, 59193, 3851, 15230, 23188, 59485, 7020, 63711, 83217, 23191, 63213, 58121, 9982, 27531, 94410, 83222, 9609, 83875, 51299, 62201, 51378, 17628, 22225, 95331, 49348, 43118, 9872, 26758, 91107, 92642, 68733, 81805, 65449, 1286, 1076, 38332, 74005, 75487, 53906, 98630, 54110, 54156, 15190, 95336, 54272, 63610, 58577, 70479, 5615, 52192, 76902, 7431, 43772, 65880, 72181, 24818, 79714, 5152, 67718, 67373, 62263, 15742, 1029, 57387, 45108, 46408, 98212, 12958, 22958, 18906, 83487, 22581, 35834, 31302, 84566, 75779, 68533, 39359, 53373, 54225, 27074, 8502, 65629, 2170, 11178, 40987, 16112, 3123, 55138, 99454, 12184, 19872, 21950, 77691, 75613, 26781, 11766, 50057, 94997, 89156, 40150, 86321, 44477, 79576, 68007, 34321, 11376, 85446, 3021, 86269, 4039, 28960, 23278, 42974, 12865, 44456, 37126, 54644, 53142, 87413, 13196, 59223, 50904, 18744, 66540, 11339, 27305, 96917, 64223, 88558, 86105, 26301, 42009, 71684, 87428, 34407, 19569, 46616, 7137, 75358, 52548, 6278, 31977, 96114, 16736, 53943, 21640, 78136, 7132, 97779, 60084, 54872, 63002, 61790, 2865, 10169, 76118, 10891, 61698, 99982, 83358, 94824, 99506, 79729, 83977, 32007, 87986, 89290, 77198, 71456, 64300, 24824, 40170, 71467, 48103, 77919, 66129, 2551, 48612, 30277, 25421, 60694, 95280, 7176, 8540, 41381, 85703, 82065, 23181, 88000, 40877, 9099, 7624, 25167, 11953, 45914, 6693, 49661, 22162, 50289, 40706, 58427, 1611, 38384, 22267, 89442, 83016, 33246, 30208, 98389, 56137, 24709, 96035, 46269, 42130, 99851, 4496, 33346, 68088, 91661, 34186, 3084, 56278, 64911, 40120};
        System.out.println(containsDuplicates.containsDuplicates(arr));
    }
    
    
}