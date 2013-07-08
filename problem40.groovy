def string= '';
for(i in 1..1000000)
{
	string = string + (String)i;
	if(string.length() >= 1000000)
	{
		break;
	}
}
