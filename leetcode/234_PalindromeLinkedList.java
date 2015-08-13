/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public class Pilha{
        Integer val[] = new Integer[10];
        int tamanho = 10;
        int pos = 0;
        Pilha(){
        }
        
        public void add(int value ){
            if (pos >= tamanho){
                int tam1 = tamanho;
                tamanho = tamanho * 2;
                Integer aux[] = new Integer[tamanho];
                int i;
                for (i = 0; i < tam1; i++)
                    aux[i] = val[i];
                aux[pos] = value;
                pos ++;
                val = aux;
            }
            else if (pos < tamanho){
                val[pos] = value;
                pos ++;
            }
        }
        
        public int pop(){
            if (pos <= tamanho && pos > 0){
                pos --;
                return val[pos];
            }
            return -1;
        }
        
        public int size(){
            return pos;
        }
        
    }
    
    public boolean isPalindrome(ListNode head) {
        ListNode aux = head;
        Pilha pilha = new Pilha();

        while ( aux != null ){
            pilha.add(aux.val);
            aux = aux.next;
        }

        int iter = pilha.size() / 2;
        if (iter == 0){
            return true;
        }

        int i;
        for (i = 0; i <= iter; i++){
            if (pilha.pop() != head.val) return false;
            head = head.next;
        }
        return true;
    }
    
}
