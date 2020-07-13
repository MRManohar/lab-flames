package service;
import java.util.Arrays;
public class FlamesCheckService{
	public char findFlames(String name1,String name2) {
		String s1 = name1;
		String s2 = name2;
		int p=0;
		s1 = s1.toUpperCase();
		s2 = s2.toUpperCase();
		char a[] = s1.toCharArray();
		char b[] = s2.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		if ((s1.length() > s2.length())||(s1.length()==s2.length())) {
			for(int i=0;i<b.length;i++){
				for(int j=0;j<a.length;j++){
					if(b[i]==a[j]){
						b[i]='#';
						a[j]='#';
						break;
					}
				}
			}
		}
		else {
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < b.length; j++) {
					if (a[i] == b[j]) {
						a[i] = '#';
						b[j] = '#';
						break;
					}
				}
			}
		}
		for(int i=0;i<a.length;i++)
			if (a[i]!='#'){
				p++;}
		for(int i=0;i<b.length;i++)
			if(b[i]!='#'){
				p++;}
		return  flames(p);		
	}
	static char flames(int n) {
		char c = 0;
		char a[]={'f','l','a','m','e','s'};
		for(int i=6;i>1;i--){
			a[n%i]='#';
		}
		for(int i=0;i<a.length;i++) {
			if (a[i] != '#') {
				c = a[i];
			}
		}
		switch(c) {
		case 'f':
			System.out.println("FRIENDS");
			break;
		case 'l':
			System.out.println("LOVERS");
			break;
		case 'a':
			System.out.println("AFFECTION");
			break;
		case 'm':
			System.out.println("MARRIAGE");
			break;
		case 'e':
			System.out.println("ENEMY");
			break;
		case 's':
			System.out.println("SIBLINGS");
			break;
		default:
			System.out.println("No relation");
		}
		return c;
	}
}
