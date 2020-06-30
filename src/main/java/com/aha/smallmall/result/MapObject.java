 
package com.aha.smallmall.result;

import java.util.LinkedHashMap;

/**
 * 文件功能描述
 * 
 * @author zjh
 * @version V1.0
 * 
 */
public class MapObject<K, V> extends LinkedHashMap<K, V> {
	public <T> T get(String key, T defaultV) {
		if (defaultV == null)
			throw new NullPointerException("没有指定泛型类型，默认不能为空");
		Class<T> clazz = defaultV != null ? (Class<T>) defaultV.getClass()
				: null;
		return get(key, defaultV, clazz);
	}

	public <T> T get(String key, T defaultV, Class<T> clazz) {
		try {
			Object o = get(key);
			if (o == null)
				return defaultV;
			T v = clazz.cast(o);
			return v;
		} catch (Exception ex) {
			ex.printStackTrace();
			return defaultV;
		}
	}
}
