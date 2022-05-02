
import java.util.Stack;
public class BalancingBrackets
{
//function to check whether brackets are balanced	
	static boolean checkingBracketsBalanced(String bracketExpression)
	{
		Stack<Character> stack= new Stack<Character>();
		for(int i=0;i< bracketExpression.length();i++)
		{
			char character =bracketExpression.charAt(i);
			if(character== '('|| character =='[' || character == '{')
			{
				stack.push(character);
				continue;				
			}
			if(stack.isEmpty())
				return false;
			char c;
			switch(character)
			{
			case '}':
				c=stack.pop();
				if(c== '('||c== '[')
					return false;
				break;
				
			case ')':
				c=stack.pop();
				if(c== '{'||c== '[')
					return false;
				break;
				
			case ']':
				c=stack.pop();
				if(c== '('||c== '{')
					return false;
				break;
			}
		}
		return (stack.isEmpty());
	}
	
//Driver code

	public static void main(String[] args) {
		
			String bracketExpression = "([[{}]])";
			Boolean result;
			result = checkingBracketsBalanced(bracketExpression);
			if(result)
				System.out.println("The entered string is balanced brackets");
			else
				System.out.println("The entered string is not balanced brackets");
		}
}
