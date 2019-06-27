public class ReplaceBlank {
		public String replaceSpace(StringBuffer str) {
			StringBuilder stringBuilder = new StringBuilder();
			int n = str.length()-1;
			for(int i =0; i< n; i++){
				if(str.charAt(i)==' '){
					stringBuilder.append("%20");
				}
				else stringBuilder.append(str.charAt(i));
			}
			String s = stringBuilder.toString();
			return s;
		}
}
