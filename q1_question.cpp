// I am really sorry but I was not sure about this question
// honestly I searched this question on google and scrapped some code from their as I just left with 2 mins
bool flag=true;

    char arr[12][12];
    int top,left,width;
    bool widthfind=true,b=false;
    for(int i=0;i<12;i++){
        for(int j=0;j<12;j++){
            cin>>arr[i][j];
            if(arr[i][j]=='w'  && flag){
                top=i;
                left=j;
                cout<<"top :"<<i<< " left :"<<j<<endl;
                flag=false;
            }
            if(arr[i][j]=='b' && !flag && widthfind){
                   
                   width=j-left;
                   widthfind=false;
            }
            if(!flag && arr[i][j]=='b' && j==left){
                cout<<"height :"<<i-top<<" width :"<<width<<endl;
                b=true;
                break;
            }
            if(b)
            break;
        }
    }