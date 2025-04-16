 ArrayList<Integer>rank=new ArrayList<>();
    ArrayList<Integer>parent=new ArrayList<>();
    private int find(int u){
        if(u==parent.get(u)){
            return u;
        }
       parent.set(u,find(parent.get(u)));
       return parent.get(u);
    }
    private void union(int x,int y){
        int x_parent=find(x);
        int y_parent=find(y);
         
        if(rank.get(x_parent)>rank.get(y_parent)){
            parent.set(y_parent,x_parent);
        }
        else if(rank.get(x_parent)<rank.get(y_parent)){
            parent.set(x_parent,y_parent);
        }
        else{
            parent.set(y_parent,x_parent);
            rank.set(x_parent,rank.get(x_parent)+1);
        }
    }