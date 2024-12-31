/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* mergeTwoLists(struct ListNode* list1, struct ListNode* list2) {
    struct ListNode *newh = NULL;
    struct ListNode *t1 = list1, *t2 = list2, *temp = NULL;
    if(list1==NULL) return list2;
    if(list2==NULL) return list1;
    while(t1!=NULL && t2!=NULL){
        if(t1->val <= t2->val){
            if(newh==NULL){
                newh = t1;
                temp = newh;
            }
            else{
            temp->next = t1;

            temp = temp->next;
            }
            t1 = t1->next;
        }
        else {
            if(newh==NULL){
                newh = t2;
                temp = newh;
            }
            else
            {
            temp->next = t2;
             temp = temp->next;
            }
          
            t2 = t2->next;
        }
    }
        
        if(t1!=NULL){
            temp->next = t1;
        }
         if(t2!=NULL){
            temp->next = t2;
        }
       
         
    
    return newh;
}