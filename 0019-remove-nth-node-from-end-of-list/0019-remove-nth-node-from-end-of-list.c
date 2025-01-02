/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */

struct ListNode* removeNthFromEnd(struct ListNode* head, int n) {
    struct ListNode *temp = head, *temp2=NULL;
    int c=0;
    while(temp!=NULL){
        c++;
        temp = temp->next;
    }
  
    int l = c-n;
    printf("%d",l);
    temp = head;
    int k = 0;
    if(l==0 && c==1){
        return NULL;
    }
   while(temp!=NULL){
      
       if(k==l){
            if(temp2==NULL){
                return temp->next;
            }
            temp2->next = temp->next;
            return head;
       }
       temp2 = temp;
       temp = temp->next;
       k++;
       
    }
     //or 
    /*while(l){
        temp2 = temp;
        temp = temp->next;
        l--;
    }
    if(temp2==NULL)
    return temp->next;

    temp2->next = temp->next;*/
    return head;
}



















