/**
 * https://www.digitalocean.com/community/tutorials/java-heap-space-vs-stack-memory
 */

public class HEAP_STACK {
    public static void main(String[] args) { // Line 1
        int a = 1;  //Line 2
        Object obj = new Object(); // Line 3
		HEAP_STACK mem = new HEAP_STACK(); // Line 4
		mem.foo(mem); // Line 5
    } // Line 9
    private void foo(Object param) { // Line 6
		String str = param.toString(); // Line 7
		System.out.println(str);
	} // Line 8
}


/* Allocation progress : 
 + 1. Run the program --> All Runtime( a, obj,foo(), main() Objecy, mem, Memory) to heap
    - Load all to HEAP until JR found main() (Line 1)
    --> Create a stack for main()

 + 2. In line 2, declare and definite local variable "a" (Line 2)
    --> Take a to main()

 + 3. In line 3, we create a instance(obj) from a class(Object)
    -- HEAP has Object 
    -- Stack has obj

 + 4. Like the 3th line

 + 5. In line 5, we call foo()
    -- foo() is stored in first block of Stack - which is more 'free' than "a" and "obj"
   |        |
   |        |
   |        |
   |  foo() |
   | main() | 

   ==> STACK     |

 + 6. In line 6, we pass a 'param' of Object to foo
 -- foo() in Stack
 -- Java pass-by-value so the reference of Object - 'param' - is located in the foo() of Stack

 + 7. In line 7, create a String (str).
 -- str go to "StringPool" - a special memory for String type
 -- Now
    - str in Stack
    - String go to HEAP.StringPool (Just because String is a 'class')

 + 8. In line 8, foo() stop working and be deleted
 -- Stack for foo() is freed
 -- 'param' is also deleted

 + 9. In line 9, main() stop and be canceled.
 -- Delete all in Runtime (every)
 */