package com.wang.design.xiangyuan;


/*
* Integer类就是使用的享元模式
*外部的方块结构也属于
*
* */
public class IntegerTest {
    public static void main(String[] args) {


        Integer name=5;
        //两条命令等同
        Integer.valueOf(5);
    }


/*贴代码
    public static Integer valueOf(int i) {
        if (i >= Integer.IntegerCache.low && i <= Integer.IntegerCache.high)
            return Integer.IntegerCache.cache[i + (-Integer.IntegerCache.low)];
        return new Integer(i);
    }*/

/*
  private static class IntegerCache {
    static final int low = -128;
    static final int high;
    static final Integer[] cache;
    static Integer[] archivedCache;

    static {
        // high value may be configured by property
        int h = 127;
        String integerCacheHighPropValue =
                VM.getSavedProperty("java.lang.Integer.IntegerCache.high");
        if (integerCacheHighPropValue != null) {
            try {
                h = Math.max(parseInt(integerCacheHighPropValue), 127);
                // Maximum array size is Integer.MAX_VALUE
                h = Math.min(h, Integer.MAX_VALUE - (-low) -1);
            } catch( NumberFormatException nfe) {
                // If the property cannot be parsed into an int, ignore it.
            }
        }
        high = h;

        // Load IntegerCache.archivedCache from archive, if possible
        CDS.initializeFromArchive(Integer.IntegerCache.class);
        int size = (high - low) + 1;

        // Use the archived cache if it exists and is large enough
        if (archivedCache == null || size > archivedCache.length) {
            Integer[] c = new Integer[size];
            int j = low;
            for(int i = 0; i < c.length; i++) {
                c[i] = new Integer(j++);
            }
            archivedCache = c;
        }
        cache = archivedCache;
        // range [-128, 127] must be interned (JLS7 5.1.7)
        assert Integer.IntegerCache.high >= 127;
    }*/
}
