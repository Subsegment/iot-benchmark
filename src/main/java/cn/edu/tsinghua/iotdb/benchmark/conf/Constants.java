package cn.edu.tsinghua.iotdb.benchmark.conf;

import cn.edu.tsinghua.iotdb.benchmark.utils.TimeUtils;

/**
 * 系统运行常量值
 */
public class Constants {
	public static final String START_TIME = "2010-01-1T00:00:00+08:00";
	public static final long START_TIMESTAMP = TimeUtils.convertDateStrToTimestamp(START_TIME);
	public static final String URL ="jdbc:tsfile://%s:%s/";
	public static final String USER ="root";
	public static final String PASSWD ="root";
	public static final String ROOT_SERIES_NAME="root.performf";
	
	public static final String CONSOLE_PREFIX = "IotDB-benchmark>";
	
	public static final String BENCHMARK_CONF = "benchmark-conf";
}