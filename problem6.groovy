def difSumOfNat(n)
{
	def i = ((n*(n+1))/2).power(2);
	def j = (n*(n+1)*(2*n+1))/6;
	return i-j;
}
println difSumOfNat(100);
