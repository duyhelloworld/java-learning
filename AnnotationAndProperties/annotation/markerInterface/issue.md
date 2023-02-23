### We can use `Annotation` instead of `Marker Interface`

### In some case, we must implements built-in MI to allow code useable
> - Serializable - use when call ObjectOutputStream.seriallizable(). 

- Throw **NotSerilizableException**
> - Clonable - Object.clone()
- Throw **CloneNotSupportedException**


### Trouble when `Annotation` - `Marker Interface`
- `Annotation` can mark only class and its subclass
- `Marker Interface` only mark all class, its subclass by the `Inheritance`.

---> Developer is encouraged to use `Annotation` than.