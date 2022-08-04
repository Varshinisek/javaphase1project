package assisted3;

	public class SingleLinkedList {
		Node head;
		static class Node{
			int data;
			Node next;
			Node(int d){
				data=d;
				next=null;
			}
			
			
		}
		
		public static SingleLinkedList insert(SingleLinkedList list, int data) {
			Node First_node=new Node(data);// Create first node
			if(list.head==null) 
				list.head=First_node;
			else {
				Node ref;
				//move to last node
				for(ref=list.head;ref.next!=null;ref=ref.next) {}
					ref.next=First_node;
			}
			
			return list;
			
		}
		
		
		public static SingleLinkedList deleteByKey(SingleLinkedList list, int key) {
		   Node	current_node=list.head, prev=null;
		   //Delete First node
		   if(current_node!=null && current_node.data==key) {
			   list.head=current_node.next;
			   System.out.println("Key founded and Deleted Successfully"+key);
		   }
		   else {
			   while(current_node!=null && current_node.data!=key) {
				   prev=current_node;
				   current_node=current_node.next;
			   }
			   if(current_node!=null) {
				   prev.next=current_node.next;
				   System.out.println("Key founded and Deleted Successfully"+key);
			   }
			   if(current_node==null)
					System.out.println("Key not found"+key);
				
				}
		   return list;
		   }
		
		
		
		public static SingleLinkedList deleteAtPosition(SingleLinkedList list, int index) {
			Node current_node=list.head,prev=null;
			//Delete First node
			   if(current_node!=null && index==0) {
				   list.head=current_node.next;
				   System.out.println(
			                index + " position element deleted");
			   }
			   else {
				   int counter = 0;
		 	        while (current_node != null) {
		 
		            if (counter == index) {
		            	prev.next = current_node.next;
		                 System.out.println(index + " position element deleted");
		                break;
		            }
		            else {
		               	 prev = current_node;
		                current_node = current_node.next;
		                counter++;
		            }
		    
				   if(current_node==null)
					   System.out.println( index + " position element not found");
			   }
			   }
			   return list;
			
		}
		
		
		public static void print(SingleLinkedList list) {
			Node last;
			for(last=list.head;last!=null;last=last.next) {
				System.out.println(last.data+" ");
			}
			
		}
		
		
		public static void main(String[] args) {
			
			SingleLinkedList list=new SingleLinkedList();
			list=insert(list,5);
			list=insert(list,7);
			list=insert(list,1);
			list=insert(list,9);
			list=insert(list,4);
			list=insert(list,8);
			list=insert(list,3);
			list=insert(list,10);
			list=insert(list,14);
			print(list);
			
			list=deleteByKey(list,5);
			print(list);
			
		    deleteAtPosition(list, 0);
		    print(list);

		}

	}
