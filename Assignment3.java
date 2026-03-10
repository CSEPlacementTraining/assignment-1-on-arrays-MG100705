class Assignment3 { 
public static int[] removeNegativeNumbers(int[] arr){ 
// Implement logic here 
int temp[] = new int[arr.length]; 
int j=0; 
for(int i=0;i<arr.length;i++) 
{ 
if(arr[i]>=0) 
{ 
temp[j]=arr[i]; 
j++; 
} 
} 
int result[] = new int[j]; 
for(int i=0;i<j;i++) 
{ 
result[i]=temp[i]; 
} 
return result; 
} 
public static void main(String[] args) { 
int[] arr = {-5,3,-2,7,8,-1,4}; 
int[] result = removeNegativeNumbers(arr); 
for(int i=0; i<result.length; i++){ 
System.out.println(result[i]); 
} 
} 
}
