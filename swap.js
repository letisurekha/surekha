var a=[2,5,6,3];
var n=a.length;
var temp=a[n-1];
a[n-1]=a[0];
a[0]=temp;
console.log(a);