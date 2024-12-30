/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode *detectCycle(struct ListNode *head) {
    struct ListNode *fast = head, *slow = head;
    //int i = 0;
    while(fast!=NULL){
         fast = fast->next;
         if(fast!=NULL){  
            fast = fast->next;
            slow = slow->next;
         }
         if(slow==fast){
            fast = head;
            while(fast!=slow){
                fast = fast->next;
                slow = slow->next;
            }
            return slow;
           /* fast = head;
            break;
         }
         }
    while(fast!=slow && fast!=NULL){
        fast = fast->next;
        slow = slow->next;
    }
    if(fast==slow){
        return slow;
    }  
    */
    
         }
    }
    return false;
}