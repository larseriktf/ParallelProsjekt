# Group:
Jonas (GitHub: Jonaseli), Lars Erik (GitHub: larseriktf)

# d)

Finding:
Running with 1 iteration resulted with longer parallel time than serial time. Running with 2 or more iterations, resulted in faster parallel time than serial time.
Our theory, is that the program re-uses the threads the second time around, which spares time. This might affect the final results.

Threshold: 10
Parallelism: 4
```
Unique numbers (Serial)    : 6321341
Unique numbers (Parallel)  : 6321341
Average running Time (Serial)      : 1064 ms
Average running Time (Parallel)    : 384 ms
Speedup: 2.7708333333333335
Efficiency: 0.6927083333333334
```

Threshold: 100
Parallelism: 4
```
Unique numbers (Serial)    : 6321341
Unique numbers (Parallel)  : 6321341
Average running Time (Serial)      : 1059 ms
Average running Time (Parallel)    : 343 ms
Speedup: 3.087463556851312
Efficiency: 0.771865889212828
```

Threshold: 1_000
Parallelism: 4
```
Unique numbers (Serial)    : 6321341
Unique numbers (Parallel)  : 6321341
Average running Time (Serial)      : 1062 ms
Average running Time (Parallel)    : 340 ms
Speedup: 3.123529411764706
Efficiency: 0.7808823529411765
```

Threshold: 5_000
Parallelism: 4
```
Unique numbers (Serial)    : 6321341
Unique numbers (Parallel)  : 6321341
Average running Time (Serial)      : 1105 ms
Average running Time (Parallel)    : 367 ms
Speedup: 3.010899182561308
Efficiency: 0.752724795640327
```

Threshold: 10_000
Parallelism: 4
```
Unique numbers (Serial)    : 6321341
Unique numbers (Parallel)  : 6321341
Average running Time (Serial)      : 1050 ms
Average running Time (Parallel)    : 327 ms
Speedup: 3.2110091743119265
Efficiency: 0.8027522935779816
```

Threshold: 50_000
Parallelism: 4
```
Unique numbers (Serial)    : 6321341
Unique numbers (Parallel)  : 6321341
Average running Time (Serial)      : 1062 ms
Average running Time (Parallel)    : 337 ms
Speedup: 3.1513353115727
Efficiency: 0.787833827893175
```

Threshold: 100_000
Parallelism: 4
```
Unique numbers (Serial)    : 6321341
Unique numbers (Parallel)  : 6321341
Average running Time (Serial)      : 1055 ms
Average running Time (Parallel)    : 335 ms
Speedup: 3.1492537313432836
Efficiency: 0.7873134328358209
```

Threshold: 500_000
Parallelism: 4
```
Unique numbers (Serial)    : 6321341
Unique numbers (Parallel)  : 6321341
Average running Time (Serial)      : 1049 ms
Average running Time (Parallel)    : 349 ms
Speedup: 3.005730659025788
Efficiency: 0.751432664756447
```

Threshold: 1_000_000
Parallelism: 4
```
Unique numbers (Serial)    : 6321341
Unique numbers (Parallel)  : 6321341
Average running Time (Serial)      : 1060 ms
Average running Time (Parallel)    : 371 ms
Speedup: 2.857142857142857
Efficiency: 0.7142857142857143
```

Testcase 4

Threshold: 10
Parallelism: 4
Iterations: 100
```

```