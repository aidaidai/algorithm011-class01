class LadderLength {
    private int wordLen;
    private Map<String,List<String>> normalWordMap=new HashMap<>();
    private Map<String,Boolean> visitedMap=new HashMap<>();
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        this.wordLen=beginWord.length();
        wordList.forEach(word->getWordNormalStr(word));

        Queue<Pair<String,Integer>> queue=new LinkedList<>();
        queue.add(new Pair<>(beginWord,1));
        while (!queue.isEmpty()){
            Pair<String,Integer> pair=queue.poll();
            String word=pair.getKey();
            Integer level=pair.getValue();
            for(int i=1;i<=wordLen;i++){
                String newWord=word.substring(0,i-1)+"*"+word.substring(i);
                List<String> allWordList=normalWordMap.get(newWord);
                if(allWordList==null){
                    continue;
                }
                for(String awl:allWordList){
                    if(endWord.equals(awl)){
                        return level+1;
                    }else{
                        if(!visitedMap.containsKey(awl)){
                            visitedMap.put(awl,true);
                            queue.add(new Pair<>(awl,level+1));
                        }
                    }
                }
            }
        }

        return 0;
    }

    private void getWordNormalStr(String word){
        for(int i=1;i<=wordLen;i++){
            String str=word.substring(0,i-1)+"*"+word.substring(i);
            List<String> list=normalWordMap.getOrDefault(str,new ArrayList<String>());
            list.add(word);
            normalWordMap.put(str,list);
        }
    }
}
