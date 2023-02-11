____ 
Khi chèn 1 node -> 
* Đo chênh lệch giữa __chiều cao cây con trái__ và __chiều cao con phải__.

    `lv =  |r - l|`

> * r - l > 0 thì lệch trái
> * Cây lệch phải thì kiểm tra con bên phải của nó
____
 - `Chiều cao con phải > con trái ` => Quay trái
____
 - `Ngược lại` => Quay phải node con phải + quay trái chính nó.
____


Cây 2 4 - 3 - 5 |- 7

VD Lệch trái phải
- Node 50 lệch r > l : quay trái 50, quay phải 78
- Node 50 l > r : quay phải 78

____