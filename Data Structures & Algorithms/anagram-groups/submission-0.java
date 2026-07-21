
class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {

            HashMap<String, List<String>> hash = new HashMap<>();

                    for(int i = 0; i < strs.length; i++) {

                                char tempA[] = strs[i].toCharArray();

                                            Arrays.sort(tempA);

                                                        String sortedStr = new String(tempA);

                                                                    if(hash.containsKey(sortedStr)) {

                                                                                    hash.get(sortedStr).add(strs[i]);

                                                                                                } else {

                                                                                                                List<String> list = new ArrayList<>();

                                                                                                                                list.add(strs[i]);

                                                                                                                                                hash.put(sortedStr, list);
                                                                                                                                                            }
                                                                                                                                                                    }

                                                                                                                                                                            return new ArrayList<>(hash.values());
                                                                                                                                                                                }
                                                                                                                                                                                }
