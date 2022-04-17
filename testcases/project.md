# Problem 8 - Parallel and Distributed Programming
## Group:
Jonas (GitHub: Jonaseli), Lars Erik (GitHub: larseriktf)

# d)

## The results

### Settings
We ran the algorithms with 100 iterations using `input/testcase4.txt` with the following thresholds and levels of parallelism:

Testing thresholds: 10, 1_000, 10_000, 100_000, 500_000 <br>
Testing parallelism: 1, 2, 4, 8

Note, that we used ForkJoin framework in this project.

<table style="text-align: center;">
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

<table style="text-align: center;">
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

## Explanation
Looking at the results, the best performance with a speedup of 3.1 used parallelism level 8 with 10000 as threshold. Given that the system we tested on has 4 available processors, it seemed strange that a parallelism level of 8 would provide the best results. We think it might be a case of randomness in execution. Besides from that, the best overall performing level of parallelism was 4. This is more expected, as it reflects the number of available processors, which would give the most amount of resources for the program. In terms of threshold, level 1000 and 100000 performed rather well compared to the other levels. 500000 on the other hand, did not perform well. Our theory is that with level 500000, the program could not split the problem into enough tasks to make the parallel version much faster than the serial one. Level 1000 and 100000 seemed to be just right.  

Interestingly enough, the efficiency number was not on par with the speedup. The best performing level of parallelism in terms of efficiency was level 1, having multiple instances of efficiency above 1. The least performing column of efficiency was 8 as parallelism, averaging an efficiency number of about ~0.33. Contrary to the speedup table, the threshold did not have much to say in terms of efficiency. The only outlier, might be level 500000, which again made poor results.

Below is printed all the output from the console after running the program with different settings. It is revealed that running time of the serial version was stable around 90 ms. Interestingly, with parallelism level 1, both versions of countUnique seemed to have more or less equal running time. Other than that, running time was not hugely affected overall.

## Findings
Beginning with thresholds, the lowest and highest values were 10 and 500000. For these values, there were no substantial changes in the result data. 10 as threshold makes it so each task is unreasonably small. On the other hand, 500000 is about half of the workload in each testcase, thus the program barely distributes the problem. With level of parallelism, we found that 1 makes the parallel version almost identical to the serial one, in terms of overall performance. With parallelism level 8, we believe it to be unecessary as it exceeds the total amount of available processors.   

Running with 1 iteration resulted with longer parallel time than serial time. Running with 2 or more iterations, resulted in faster parallel time than serial time.
Our theory, is that the program re-uses the threads the second time around, which spares time. This might affect the final results.

## Outputs

Threshold: 10, Parallelism: 1
```
Average running Time (Serial)      : 90 ms
Average running Time (Parallel)    : 99 ms
Speedup: 0.9090909090909091
Efficiency: 0.9090909090909091
```

Threshold: 10, Parallelism: 2
```
Average running Time (Serial)      : 96 ms
Average running Time (Parallel)    : 61 ms
Speedup: 1.5737704918032787
Efficiency: 0.7868852459016393
```

Threshold: 10, Parallelism: 4
```
Average running Time (Serial)      : 89 ms
Average running Time (Parallel)    : 34 ms
Speedup: 2.6176470588235294
Efficiency: 0.6544117647058824
```

Threshold: 10, Parallelism: 8
```
Average running Time (Serial)      : 90 ms
Average running Time (Parallel)    : 34 ms
Speedup: 2.6470588235294117
Efficiency: 0.33088235294117646
```

Threshold: 1_000, Parallelism: 1
```
Average running Time (Serial)      : 90 ms
Average running Time (Parallel)    : 86 ms
Speedup: 1.0465116279069768
Efficiency: 1.0465116279069768
```

Threshold: 1_000, Parallelism: 2
```
Average running Time (Serial)      : 93 ms
Average running Time (Parallel)    : 46 ms
Speedup: 2.0217391304347827
Efficiency: 1.0108695652173914
```

Threshold: 1_000, Parallelism: 4
```
Average running Time (Serial)      : 92 ms
Average running Time (Parallel)    : 31 ms
Speedup: 2.967741935483871
Efficiency: 0.7419354838709677
```

Threshold: 1_000, Parallelism: 8
```
Average running Time (Serial)      : 93 ms
Average running Time (Parallel)    : 30 ms
Speedup: 3.1
Efficiency: 0.3875
```

Threshold: 10_000, Parallelism: 1
```
Average running Time (Serial)      : 96 ms
Average running Time (Parallel)    : 88 ms
Speedup: 1.0909090909090908
Efficiency: 1.0909090909090908
```

Threshold: 10_000, Parallelism: 2
```
Average running Time (Serial)      : 90 ms
Average running Time (Parallel)    : 55 ms
Speedup: 1.6363636363636365
Efficiency: 0.8181818181818182
```

Threshold: 10_000, Parallelism: 4
```
Average running Time (Serial)      : 95 ms
Average running Time (Parallel)    : 32 ms
Speedup: 2.96875
Efficiency: 0.7421875
```

Threshold: 10_000, Parallelism: 8
```
Average running Time (Serial)      : 96 ms
Average running Time (Parallel)    : 38 ms
Speedup: 2.526315789473684
Efficiency: 0.3157894736842105
```

Threshold: 100_000, Parallelism: 1
```
Average running Time (Serial)      : 90 ms
Average running Time (Parallel)    : 89 ms
Speedup: 1.0112359550561798
Efficiency: 1.0112359550561798
```

Threshold: 100_000, Parallelism: 2
```
Average running Time (Serial)      : 96 ms
Average running Time (Parallel)    : 50 ms
Speedup: 1.92
Efficiency: 0.96
```

Threshold: 100_000, Parallelism: 4
```
Average running Time (Serial)      : 90 ms
Average running Time (Parallel)    : 32 ms
Speedup: 2.8125
Efficiency: 0.703125
```

Threshold: 100_000, Parallelism: 8
```
Average running Time (Serial)      : 92 ms
Average running Time (Parallel)    : 31 ms
Speedup: 2.967741935483871
Efficiency: 0.3709677419354839
```

Threshold: 500_000, Parallelism: 1
```
Average running Time (Serial)      : 90 ms
Average running Time (Parallel)    : 91 ms
Speedup: 0.989010989010989
Efficiency: 0.989010989010989
```

Threshold: 500_000, Parallelism: 2
```
Average running Time (Serial)      : 90 ms
Average running Time (Parallel)    : 54 ms
Speedup: 1.6666666666666667
Efficiency: 0.8333333333333334
```

Threshold: 500_000, Parallelism: 4
```
Average running Time (Serial)      : 90 ms
Average running Time (Parallel)    : 47 ms
Speedup: 1.9148936170212767
Efficiency: 0.4787234042553192
```

Threshold: 500_000, Parallelism: 8
```
Average running Time (Serial)      : 91 ms
Average running Time (Parallel)    : 47 ms
Speedup: 1.9361702127659575
Efficiency: 0.24202127659574468
```

# e)

Threshold: 10 000
Parallelism: 4
Iterations: 10

<table style="text-align: center">
    <tbody>
        <tr>
            <td></td>
            <td>Running Time (Serial)</td>
            <td>Running Time (Parallel)</td>
            <td>Speedup</td>
            <td>Efficiency</td>
        </tr>
        <tr>
            <td>testcase3.txt</td>
            <td>13 ms</td>
            <td>6 ms</td>
            <td>2.17</td>
            <td>0.54</td>
        </tr>
        <tr>
            <td>testcase4.txt</td>
            <td>101 ms</td>
            <td>32 ms</td>
            <td>3.16</td>
            <td>0.79</td>
        </tr>
        <tr>
            <td>testcase5.txt</td>
            <td>1071 ms</td>
            <td>332 ms</td>
            <td>3.23</td>
            <td>0.81</td>
        </tr>
        <tr>
            <td>testcase6.txt</td>
            <td>11886 ms</td>
            <td>4529 ms</td>
            <td>2.62</td>
            <td>0.66</td>
        </tr>
    </tbody>
</table>

## Short explanation
An interesting finding, while running the program with different inputs is relating to the file size. It seems that both versions of countUnique multiplies its running time with roughly ~10 for each subsequent testcase. Looking at the file sizes, it reveals that every testcase is also about ~10 times larger in file size than the previous. Both speedup and efficiency were relatively unchanged. 

## Outputs

Threshold: 10 000, Parallelism: 4, Iterations: 10, Input: testcase3.txt
```
Average running Time (Serial)      : 13 ms
Average running Time (Parallel)    : 6 ms
Speedup: 2.1666666666666665
Efficiency: 0.5416666666666666
```

Threshold: 10 000, Parallelism: 4, Iterations: 10, Input: testcase4.txt
```
Average running Time (Serial)      : 101 ms
Average running Time (Parallel)    : 32 ms
Speedup: 3.15625
Efficiency: 0.7890625
```

Threshold: 10 000, Parallelism: 4, Iterations: 10, Input: testcase5.txt
```
Average running Time (Serial)      : 1071 ms
Average running Time (Parallel)    : 332 ms
Speedup: 3.2259036144578315
Efficiency: 0.8064759036144579
```

Threshold: 10 000, Parallelism: 4, Iterations: 10, Input: testcase6.txt
```
Average running Time (Serial)      : 11886 ms
Average running Time (Parallel)    : 4529 ms
Speedup: 2.624420401854714
Efficiency: 0.6561051004636785
```