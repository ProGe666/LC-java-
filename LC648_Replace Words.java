class solution {
	public String replaceWords(list<string> dict , String sentence){
		Set<String> set = new HashSet<>(dict);
		StringBuilder Output = new StringBuilder();
		String[]words = sentence.split(" ");
		for(int i =0; i< words.length;i++){
			for(int j=0; j<words[i].length;j++){
				String root =words[i].substring(0,k);
				if(set.contains(root)){
					words[i] = root;
				}
			}
			Output.append(worad[i]+" ");
		} 
		return Output.substring(0,Output.length()-1);
	}
}




