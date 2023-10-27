class Solution {
    public int differenceOfSums(int n, int m) {
        if(n<m)
            return sumOfNatural(n);
        int numDiv = n/m;
        int num2 = sumOfNatural(numDiv) * m;
        int num1 = sumOfNatural(n) - num2;
        return num1-num2;
    }
    public int sumOfNatural(int n){
        return (n * (n+1))/2;
    }
}