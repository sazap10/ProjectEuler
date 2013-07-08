def isPalindrome(n)
{
	if(reverse(n).equals(n.toString()))
	{
		return true;
	}
	else{
		return false;
	}
}
def reverse(x)
{
	return x.toString().reverse()
}
def largestProductOfThree()
{
	def largest = 0;
	def ij = 0;
	for(i in 100..999)
	{
		for(j in 100..999)
		{
			ij = i*j;
			if(isPalindrome(ij))
			{
				if(ij > largest)
				{
					largest = ij;
				}
			}
		}
	}
	println ij;
	return largest;
}
println isPalindrome(906609);
println largestProductOfThree();
