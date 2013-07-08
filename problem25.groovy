def digitsFib(n)
{
	def phi =  1.61803399;
	def dig = (n*Math.log10(phi))-(Math.log10(5)/2);
	return 1+Math.floor(dig);
}
def numOfDig = 0;
def n = 2000;
while(numOfDig < 1000)
{
	numOfDig= digitsFib(n);
	n++;
}
println n-1;
