# Group:

Jonas (GitHub: Jonaseli), Lars Erik (GitHub: larseriktf)

# d)

Finding:
Running with 1 iteration resulted with longer parallel time than serial time. Running with 2 or more iterations, resulted in faster parallel time than serial time.
Our theory, is that the program re-uses the threads the second time around, which spares time. This might affect the final results.

Settings:
Iterations: 100
Using: input/testcase4.txt

Testing thresholds: 10, 1_000, 10_000, 100_000, 500_000
Testing parallelism: 1, 2, 4, 8

<table style="text-align: center">
    <tbody>
        <tr>
            <td colspan="2" rowspan="2">Speedup</td>
            <td colspan="4">Parallelism</td>
        </tr>
        <tr>
            <td>1</td>
            <td>2</td>
            <td>4</td>
            <td>8</td>
        </tr>
        <tr>
            <td rowspan="6">Threshold</td>
        </tr>
        <tr>
            <td>10</td>
            <td>0.91</td>
            <td>0.79</td>
            <td>0.65</td>
            <td>0.33</td>
        </tr>
        <tr>
            <td>1000</td>
            <td>1.05</td>
            <td>1.01</td>
            <td>0.74</td>
            <td>0.39</td>
        </tr>
        <tr>
            <td>10 000</td>
            <td>1.09</td>
            <td>0.82</td>
            <td>0.74</td>
            <td>0.32</td>
        </tr>
        <tr>
            <td>100 000</td>
            <td>1.01</td>
            <td>0.96</td>
            <td>0.70</td>
            <td>0.37</td>
        </tr>
        <tr>
            <td>500 000</td>
            <td>0.99</td>
            <td>0.83</td>
            <td>0.48</td>
            <td>0.24</td>
        </tr>
    </tbody>
</table>

<table style="text-align: center">
    <tbody>
        <tr>
            <td colspan="2" rowspan="2">Efficiency</td>
            <td colspan="4">Parallelism</td>
        </tr>
        <tr>
            <td>1</td>
            <td>2</td>
            <td>4</td>
            <td>8</td>
        </tr>
        <tr>
            <td rowspan="6">Threshold</td>
        </tr>
        <tr>
            <td>10</td>
            <td>0.91</td>
            <td>1.57</td>
            <td>2.62</td>
            <td>2.65</td>
        </tr>
        <tr>
            <td>1000</td>
            <td>1.05</td>
            <td>2.02</td>
            <td>2.97</td>
            <td>3.1</td>
        </tr>
        <tr>
            <td>10 000</td>
            <td>1.09</td>
            <td>1.64</td>
            <td>2.97</td>
            <td>2.53</td>
        </tr>
        <tr>
            <td>100 000</td>
            <td>1.01</td>
            <td>1.92</td>
            <td>2.81</td>
            <td>2.97</td>
        </tr>
        <tr>
            <td>500 000</td>
            <td>0.99</td>
            <td>1.67</td>
            <td>1.91</td>
            <td>1.94</td>
        </tr>
    </tbody>
</table>

Threshold: 10
Parallelism: 1

```
Average running Time (Serial)      : 90 ms
Average running Time (Parallel)    : 99 ms
Speedup: 0.9090909090909091
Efficiency: 0.9090909090909091
```

Threshold: 10
Parallelism: 2

```
Average running Time (Serial)      : 96 ms
Average running Time (Parallel)    : 61 ms
Speedup: 1.5737704918032787
Efficiency: 0.7868852459016393
```

Threshold: 10
Parallelism: 4

```
Average running Time (Serial)      : 89 ms
Average running Time (Parallel)    : 34 ms
Speedup: 2.6176470588235294
Efficiency: 0.6544117647058824
```

Threshold: 10
Parallelism: 8

```
Average running Time (Serial)      : 90 ms
Average running Time (Parallel)    : 34 ms
Speedup: 2.6470588235294117
Efficiency: 0.33088235294117646
```

Threshold: 1_000
Parallelism: 1

```
Average running Time (Serial)      : 90 ms
Average running Time (Parallel)    : 86 ms
Speedup: 1.0465116279069768
Efficiency: 1.0465116279069768
```

Threshold: 1_000
Parallelism: 2

```
Average running Time (Serial)      : 93 ms
Average running Time (Parallel)    : 46 ms
Speedup: 2.0217391304347827
Efficiency: 1.0108695652173914
```

Threshold: 1_000
Parallelism: 4

```
Average running Time (Serial)      : 92 ms
Average running Time (Parallel)    : 31 ms
Speedup: 2.967741935483871
Efficiency: 0.7419354838709677
```

Threshold: 1_000
Parallelism: 8

```
Average running Time (Serial)      : 93 ms
Average running Time (Parallel)    : 30 ms
Speedup: 3.1
Efficiency: 0.3875
```

Threshold: 10_000
Parallelism: 1

```
Average running Time (Serial)      : 96 ms
Average running Time (Parallel)    : 88 ms
Speedup: 1.0909090909090908
Efficiency: 1.0909090909090908
```

Threshold: 10_000
Parallelism: 2

```
Average running Time (Serial)      : 90 ms
Average running Time (Parallel)    : 55 ms
Speedup: 1.6363636363636365
Efficiency: 0.8181818181818182
```

Threshold: 10_000
Parallelism: 4

```
Average running Time (Serial)      : 95 ms
Average running Time (Parallel)    : 32 ms
Speedup: 2.96875
Efficiency: 0.7421875
```

Threshold: 10_000
Parallelism: 8

```
Average running Time (Serial)      : 96 ms
Average running Time (Parallel)    : 38 ms
Speedup: 2.526315789473684
Efficiency: 0.3157894736842105
```

Threshold: 100_000
Parallelism: 1

```
Average running Time (Serial)      : 90 ms
Average running Time (Parallel)    : 89 ms
Speedup: 1.0112359550561798
Efficiency: 1.0112359550561798
```

Threshold: 100_000
Parallelism: 2

```
Average running Time (Serial)      : 96 ms
Average running Time (Parallel)    : 50 ms
Speedup: 1.92
Efficiency: 0.96
```

Threshold: 100_000
Parallelism: 4

```
Average running Time (Serial)      : 90 ms
Average running Time (Parallel)    : 32 ms
Speedup: 2.8125
Efficiency: 0.703125
```

Threshold: 100_000
Parallelism: 8

```
Average running Time (Serial)      : 92 ms
Average running Time (Parallel)    : 31 ms
Speedup: 2.967741935483871
Efficiency: 0.3709677419354839
```

Threshold: 500_000
Parallelism: 1

```
Average running Time (Serial)      : 90 ms
Average running Time (Parallel)    : 91 ms
Speedup: 0.989010989010989
Efficiency: 0.989010989010989
```

Threshold: 500_000
Parallelism: 2

```
Average running Time (Serial)      : 90 ms
Average running Time (Parallel)    : 54 ms
Speedup: 1.6666666666666667
Efficiency: 0.8333333333333334
```

Threshold: 500_000
Parallelism: 4

```
Average running Time (Serial)      : 90 ms
Average running Time (Parallel)    : 47 ms
Speedup: 1.9148936170212767
Efficiency: 0.4787234042553192
```

Threshold: 500_000
Parallelism: 8

```
Average running Time (Serial)      : 91 ms
Average running Time (Parallel)    : 47 ms
Speedup: 1.9361702127659575
Efficiency: 0.24202127659574468
```
