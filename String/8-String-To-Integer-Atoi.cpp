// Problem Number: 8
// Problem Name: String to Integer (atoi)
// Difficulty: Medium
// Topic: String

class Solution {
public:
     bool isdig(char c){
        if(c>='0' and c<='9')
            return true;
        else return false;
    }

    int atoi(const char *str) {
        // Start typing your C/C++ solution below
        // DO NOT write int main() function
        int i=0,result=0;
        bool flag =true;
		int cnt=0;
        while(str[i] ==' ' or str[i] == '\t') i++;

        if(str[i] == '-') {
            flag = false;
            i++;
        }

        if(str[i] == '+') i++;


        while(isdig(str[i])){
			result *= 10;
           // cout<<result<<endl;
			result += str[i]-'0';
            i++;
			cnt++;
			if(cnt == 10){
				result = -1;
				break;
			}
        }
	//	cout<<flag<<endl;
		if(flag == false) result *= -1;
        if(result < 0 and flag == true) result = 2147483647;
        else if(result >0 and flag == false) result = -2147483648;
        return result;

    }

};