## Graph : 1 grap luôn phải có : 
- Vertex - Nodes
- Edges 

## Type : 
- Directed(di-graph) : có chiều ưu tiên giữa các đỉnh(vertex)
- Un-directed : ko có. chiều nào chạy đều đc.

## Usage :
- Social network: me - my friend
- City road
- Precedenct contraint course

## Presentation : 
- Adjancency matrix
- Adjancency list
### Example

![](/index.png)

_____
| * | 0 | 1 | 2 | 3 |
|---|---|---|---|---|
| 0 | 0 | 1 | 1 | 1 |
| 1 | 1 | 0 | 1 | 0 |
| 2 | 1 | 1 | 0 | 0 |
| 3 | 1 | 0 | 0 | 0 |


(If it's weighted graph, replace 1 with the weight of edge)
_____
{0} ===> {1} ===> {2} ===> {3} /

{1} ===> {2} ===> {0} /

{2} ===> {0} ===> {1} /

{3} ===> {0} /