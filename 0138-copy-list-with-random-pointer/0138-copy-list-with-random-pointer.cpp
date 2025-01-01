/*
// Definition for a Node.
class Node {
public:
    int val;
    Node* next;
    Node* random;
    
    Node(int _val) {
        val = _val;
        next = NULL;
        random = NULL;
    }
};
*/

class Solution {
public:
    Node* copyRandomList(Node* head) {
       /* unordered_map<Node*, Node*>m;
        Node *temp = head;
        while(temp!=NULL){
            Node *newn = new Node(temp->val);
            m[temp] = newn;
            temp = temp->next;
        }
        temp = head;
        while(temp!=NULL){
             m[temp]->next = m[temp->next];
             m[temp]->random = m[temp->random];
             temp = temp->next;
        }
        return m[head];*/
        if (!head) return NULL;
        Node *temp = head;
        while(temp!=NULL){
            Node *newn = new Node(temp->val);
            newn->next = temp->next;
            temp->next = newn;
            temp = temp->next->next;
            
        }
        Node *th1 = head;
       while(th1!=NULL){
        if(th1->random != NULL){
            th1->next->random = th1->random->next;
        }
        th1 = th1->next->next;
       }
        th1 = head;
        Node *th2 = head->next;
        Node *newHead = head->next;
        while(th1!=NULL){
           th1->next = th1->next->next;
           if(th2->next != NULL){
              
           th2->next = th2->next->next;
           }
           th1 = th1->next;
           th2 = th2->next;
        }
        
         return newHead;

    }
};