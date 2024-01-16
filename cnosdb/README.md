Benchmark cnosdb
---
This project is using iot-benchmark to test cnosdb

# 1. environment
1. cnosdb

# 2. config
[Demo config](config.properties)

# 3. test result
```
----------------------Main Configurations----------------------
########### Test Mode ###########
BENCHMARK_WORK_MODE=testWithDefaultPath
########### Database Connection Information ###########
DOUBLE_WRITE=false
DBConfig=
  DB_SWITCH=CnosDB
  HOST=[127.0.0.1]
########### Data Mode ###########
GROUP_NUMBER=20
DEVICE_NUMBER=20
REAL_INSERT_RATE=1.0
SENSOR_NUMBER=300
IS_SENSOR_TS_ALIGNMENT=true
IS_OUT_OF_ORDER=false
OUT_OF_ORDER_RATIO=0.5
########### Data Amount ###########
OPERATION_PROPORTION=1:1:1:1:1:1:1:1:1:1:1:1
CLIENT_NUMBER=20
LOOP=1000
BATCH_SIZE_PER_WRITE=10
DEVICE_NUM_PER_WRITE=1
START_TIME=2022-01-01T00:00:00+08:00
POINT_STEP=5000
OP_MIN_INTERVAL=0
OP_MIN_INTERVAL_RANDOM=false
INSERT_DATATYPE_PROPORTION=1:1:1:1:1:1
ENCODINGS=RLE/TS_2DIFF/TS_2DIFF/GORILLA/GORILLA/DICTIONARY
COMPRESSOR=LZ4
########### Query Param ###########
QUERY_DEVICE_NUM=1
QUERY_SENSOR_NUM=1
QUERY_INTERVAL=250000
STEP_SIZE=1
IS_RECENT_QUERY=false
########### Other Param ###########
IS_DELETE_DATA=true
CREATE_SCHEMA=true
BENCHMARK_CLUSTER=false
VECTOR=true

---------------------------------------------------------------
main measurements:
Create schema cost 0.02 second
Test elapsed time (not include schema creation): 675.41 second
----------------------------------------------------------Result Matrix----------------------------------------------------------
Operation                okOperation              okPoint                  failOperation            failPoint                throughput(point/s)      
INGESTION                1668                     5004000                  0                        0                        7408.82                  
PRECISE_POINT            1688                     23                       0                        0                        0.03                     
TIME_RANGE               1609                     155150                   0                        0                        229.71                   
VALUE_RANGE              1724                     166222                   0                        0                        246.11                   
AGG_RANGE                1634                     1649                     0                        0                        2.44                     
AGG_VALUE                1589                     1603                     0                        0                        2.37                     
AGG_RANGE_VALUE          1618                     1628                     0                        0                        2.41                     
GROUP_BY                 1654                     21282                    0                        0                        31.51                    
LATEST_POINT             1790                     1826                     0                        0                        2.70                     
RANGE_QUERY_DESC         1706                     164620                   0                        0                        243.73                   
VALUE_RANGE_QUERY_DESC   1686                     162758                   0                        0                        240.98                   
GROUP_BY_DESC            1634                     3268                     0                        0                        4.84                     
---------------------------------------------------------------------------------------------------------------------------------
--------------------------------------------------------------------------Latency (ms) Matrix--------------------------------------------------------------------------
Operation                AVG         MIN         P10         P25         MEDIAN      P75         P90         P95         P99         P999        MAX         SLOWEST_THREAD
INGESTION                472.79      55.60       271.86      365.86      466.10      570.65      663.35      734.72      905.30      1768.98     2269.57     45914.96    
PRECISE_POINT            695.14      4.07        490.58      603.44      685.95      793.04      908.69      964.60      1095.05     1279.20     1300.21     65139.24    
TIME_RANGE               709.03      7.05        508.12      610.07      695.80      813.38      921.99      979.65      1095.08     1297.58     1455.05     63186.26    
VALUE_RANGE              703.79      4.68        499.48      607.90      698.86      808.39      907.85      971.24      1115.79     1233.72     1288.99     68884.63    
AGG_RANGE                703.13      4.74        488.34      610.59      699.75      810.53      919.68      980.62      1147.04     1288.55     1349.92     73107.20    
AGG_VALUE                705.26      5.00        487.70      610.22      700.30      815.92      919.78      984.48      1114.58     1268.55     1304.38     66891.55    
AGG_RANGE_VALUE          705.55      6.29        496.80      611.57      696.18      811.77      924.07      980.68      1123.80     1268.72     1346.03     74345.10    
GROUP_BY                 790.13      5.95        556.27      661.20      775.18      924.88      1047.01     1134.47     1247.65     1382.07     1400.50     79874.45    
LATEST_POINT             704.17      4.38        480.16      610.17      703.02      822.40      930.91      987.51      1129.33     1315.92     1323.66     77348.19    
RANGE_QUERY_DESC         698.82      9.88        492.84      605.99      695.17      797.75      909.35      970.00      1088.11     1427.33     1483.72     73537.32    
VALUE_RANGE_QUERY_DESC   702.36      6.42        483.32      608.75      701.29      807.10      913.01      980.12      1120.67     1286.03     1476.24     69568.54    
GROUP_BY_DESC            433.06      6.10        227.54      351.53      423.08      528.47      638.69      698.01      845.43      967.81      1022.87     41430.31    
-----------------------------------------------------------------------------------------------------------------------------------------------------------------------
```