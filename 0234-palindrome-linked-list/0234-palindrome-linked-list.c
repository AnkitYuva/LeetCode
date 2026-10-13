/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
bool isPalindrome(struct ListNode* head) {
    struct ListNode* slow = head;
    struct ListNode* fast = head;
    struct ListNode* rev = NULL;
    while(fast != NULL && fast->next != NULL){
        struct ListNode* temp = slow;
        slow = slow->next;
        fast = fast->next->next;
        temp->next = rev;
        rev = temp;
    }
    if(fast != NULL){
        slow = slow->next;
    }
    while(slow != NULL && slow->val == rev->val){
        slow = slow->next;
        rev = rev->next;
    }
    return slow == NULL;


    // int count = 0;
    // struct ListNode *temp = head;
    // while(temp!=NULL){
    //     count++;
    //     temp=temp->next;
    // }
    // int *arr = (int*)malloc(count*sizeof(int));
    // temp = head;
    // for(int i = 0; i < count; i++){
    //     arr[i]=temp->val;
    //     temp=temp->next;
    // }
    // int low = 0;
    // int high = count-1;
    // while(low<high){
    //     if(arr[low]!=arr[high]){
    //     return false;
    //     }
    //     low++;
    //     high--;
    // }
    // free(arr);
    // return true;
}