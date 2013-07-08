def isPalindrome(n)
{
	if(reverse(n).equals(n))
	{
		return true;
	}
	else{
		return false;
	}
}
def reverse(x)
{
	return x.reverse()
}
def binString(n)
{
	return Integer.toBinaryString(n);
}
def sum = 0;
for(i = 1;i <1000000;i++)
{
	if(isPalindrome((String)i) && isPalindrome(binString(i)))
	{
		sum+= i;
	}
}
println sum;
