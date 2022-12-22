package programmers.level2;

public class 스킬트리 {
    class Solution {
        public int solution(String skill, String[] skill_trees) {
            int answer = 0;
            String charAt;
            String s;
            for (String skill_tree : skill_trees) {
                s = skill_tree;
                for (int i =0; i< s.length(); i++) {
                    charAt = String.valueOf(s.charAt(i));
                    if(!skill.contains(charAt)) {
                        skill_tree = skill_tree.replace(charAt,"");
                    }
                }
                if (skill_tree.startsWith(String.valueOf(skill.charAt(0))) && skill.contains(skill_tree) || skill_tree.isEmpty())
                    answer++;
            }
            return answer;
        }
    }
}
