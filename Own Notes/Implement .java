public class Implement{
	Node head;
	
	static class Node{
		int data;
		Node next;
		
		 Node(int d){
			this.data = d;
			next = null;
			}
	}
	public void display(){
		Node temp = head;
		while(temp!= null){
			System.out.print(temp.data + "  -->  ");
			temp = temp.next;
		}
	}
	
	public void insertFirst(int new_data){
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;
	}
	
	public void insertBetween(Node prev_node, int new_data){
		Node new_node = new Node(new_data);
		new_node.next = prev_node.next;
		prev_node.next = new_node;	
	}
	
	public void insertLast(int new_data){
		Node new_node = new Node(new_data);
		if(head==null){
			head = new Node(new_data);
			return;
		}
		new_node.next = null;
		Node last = head;
		while(last.next !=null){
				last = last.next;
				last.next = new_node;
				return;
		}
	}
	
	
	//DELETETION WITH POSITION
	void deleteNode(int pos)
{
		if(head==null)
			return;
		
		Node temp = head;
		//deletion at beginning with pos=0;
		if(pos == 0){
			head = temp.next;
			return;
		}
		
		for(int i =0; temp!= null && i < pos-1 ;i++){			//or i<=pos;
			temp = temp.next;
		}
		if(temp == null || temp.next == null)//for securing invalid index/input
			return;
		Node n = temp.next.next; //tracking using n is important or else chances of losing nodes
		temp.next = n;

	}
	
	
	
	//COUNT NUMBER OF NODES IN LINKEDLIST/IDENTIFY LENGTH OF LINKEDLIST
	public int count(Node temp/*starting point*/)
	{
		//simple iterative
		Node temp = head; //define karna is necessary
		int count = 0;
		while(temp!=null)
		{
			count++;
			temp = temp.next;
		}
		
		return count;
	}
	
	//recursive function / (tail recursion)
	
	
	public int countRecursive(Node temp)
	{
		if(temp==null)
			return 0;
		
		return 1 + countRecursive(temp.link);
	}
	
	
	
	
	//SEARCH A NODE ELEMENT IN A LINKEDLIST
	
	key = 12
	
	public boolean search(Node temp, int key)
	{
		//compare data and key value to check if key is present
		Node temp = head;
		while(temp!=null)
		{
			if(temp.data==key)
				return true; //search is successful
			temp = temp.link;
		}
		return false;		
	}
	
	
	
	
	
	//REVERSE A LINKEDLIST
	
	
	
	//make pointers temp, current, n(prev) // prev(n), current(c) next(temp)
	//shift n to current pointer, current to temp and temp to next node
	//add link of 13 in 14 (reverse manner)
	//current node woh node hai jisko reverse karna
	//give previous node address to current node for reversing
	//dont touch head 
	// next ko head ke pass connect kiya
	//curr ko next ke pass connect kiya
	//next ko next node pe bhejo before breaking link
	//1st node mei prev ka address do so it goes to null
	//break karne pe first node is pointing towards null
	
	public void reverse(Node node/*starting point*/)
	{
		node = head;
		Node prev = null;
		Node curr = node; //starting point ke dekhega
		Node next = null;
		
		while(curr!= null)
		{
			next = curr.link;
			curr.link = prev;
			prev = curr;
			curr = next;
		}
		
		head = prev;           
		
	}
	
	
	
	
	
	//FUNCTION TO GET Nth NODE OF THE LINKEDLIST
	
	//hw reverse side se 3 pos check karo data
	
	
	
	public int nElement(int pos)
	{
		Node temp = head; //starting point saathhi
		int count=0;
		while(temp != null){
			if(c == pos)
				return temp.data;
			c++;
			temp = temp.next;
		}
		assert(false);
		return 0;
	}
	
	
	
	
	
	//IDENTIFY MIDDLE ELEMENT OF A LINKEDLIST
	//slow pointer  = ptr1 (single node hopper)
	//fast pointer  = ptr2 (double node hopper)
	//CHECK FOR EVEN NUMBER OF NODES AND CHECK DIFFERENT COMBINATIONS
	
	
	
	public void centerelement(){
		Node slow = head;
		Node fast = head;
		
		while(fast != null && fast.next != null)
		{
			slow = slow.next;	//need value of center element
			fast = fast.next.next;	//this doesnt affect our value
		}
		System.out.println(slow.data);
	}
	
	
	//SHUBHAM'S CODE
	/*
	ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow.value;
    }
	*/
	
	public static void main(String args[]){
		Implement i = new Implement();
		i.head = new Node(11);
		Node second = new Node(22);
		Node third = new Node(33);
		
		i.head.next = second;
		second.next = third;
		i.display();
		i.insertFirst(5);
		i.insertLast(40);
		i.insertBetween(i.head.next,10);
		System.out.println("---------------------------------");
		i.display();
		}
	}

