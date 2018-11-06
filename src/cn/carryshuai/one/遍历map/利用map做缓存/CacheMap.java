package cn.carryshuai.one.遍历map.利用map做缓存;

import org.junit.Test;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CacheMap {

    public static   Map<String,String> cacheMap = new ConcurrentHashMap<>();

    public static void setCacheMap(Map<String, String> cacheMap) {
        CacheMap.cacheMap = cacheMap;
    }

    public static Map<String, String> getCacheMap() {
        return cacheMap;
    }

}
