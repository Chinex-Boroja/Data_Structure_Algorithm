package com.chinex.boroja;

public class Test {
/*
double[][] a;
a = new double[M][N];
for (int i = 0; i < M; i++)
    for (int j = 0; j < N; j++)
       a[i][j] = 0.0;
 */

/*
find the maximum of the array values
double max = [0];
for (int i = 1; i < a.length; i++)
if (a[i] > max) max = a[i]
 */

/*
compute the average of the array values
int N = a.length;
double sum = 0.0;
for (int i = 0; i < N; i++)
sum += a[i];
double average = sum / N;
 */

/*
copy to another array
int N = a.length;
double[] b = new double[N];
for (int i = 0; i < N; i++)
   b[i] = a[i];
 */

/*
Reverse the elements within an array
int N = a.length;
for (int i = 0; i < N/2; i++) {
   double temp = a[i];
   a[i] = a[N-1-i];
   a[N-1-i] = temp;
 }
 */

/*
matrix-matrix multiplication (square matrices)
int N = a.length;
double[][] c = new double[N][N];
for (int i = 0; i < N; i++)
   for (int j = 0; j < N; j++) {
      // Compute dot product of row i and column j.
      for (int k = 0; k < N; k++)
         c[i][j] += a[i][k] *b[k][j];
    }
 */

/*
public static double sqrt (double c) {
    if(c < 0) return Double.NaN;
    double err = 1e-15;

    double t = c;
    while (Math.abs(t - c/t) > err * t)
        t = (c/t + t) / 2.0;
    return t;
 */

/*
absolute value of an int value
public static int abs(int x) {
    if (x < 0) return -x;
    else return x;
}
 */

/*
primality test
public static boolean isPrime(int x) {
    if (N < 0) return false;
    for (int i = 2; i*i <= N; i++)
        if(N % i == 0) return false;
    return true;
}
 */
/*
public static double hypotenuse(double a, double b) {
    return Math.sqrt(a*a + b*b);
}
 */

/*
Typical Implementation of Static methods
public static double Harmonic(int N) {
    double sum = 0.0;
    for (int i = 1; i <= N; i++)
        sum += 1.0 / i;
    return sum;
}
 */

}
