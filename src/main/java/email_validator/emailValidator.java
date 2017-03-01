package email_validator;

public class emailValidator {
	public static void main(){
	}
	public int checkInpt(String emailAddress){
		int j=0,k=0;
		int result = 0;
		for(int i = 0;i < emailAddress.length();i++){
			if(emailAddress.charAt(i)=='@'){
				j++;
			}
			if(emailAddress.charAt(i)=='.'){
				k++;
			}
		}
		if(j>1&&k==0){
			return 0;
		}
		if(k==0&&j==1){
			return 1;
		}
		if(j>1&&k>0){
			return 1;
		} 
		if(j==0&&k==0){
			return 0;
		}
		if(j==1&&k>0){
			return 2;
		}
		if(j==0&&k>0){
			return 1;
		}
		return result;
	}
	
}
