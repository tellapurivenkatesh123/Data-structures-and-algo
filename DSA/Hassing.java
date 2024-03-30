import java.util.*;
import java.util.Map.Entry;
public class Hassing {
    public static void numberHasing(int arr[],int arr1[]){
        int hash[]=new int[10000];             //considering the highest element is 9 in the array if it is not define 10^6 inside main
        for(int i=0;i<arr.length;i++){      //10^7 globally
            hash[arr[i]]+=1;
        }
        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]+" "+hash[arr1[i]]);
        }
        }
    public static void charecterHasing(String s,String q){
        int hash[]=new int[256];
        for(int i=0;i<s.length();i++){
            hash[s.charAt(i)]+=1;           //here we're considering all charecters we have 255 ascii values 
        }                                   //so we are creating array size of 256
        for(int i=0;i<q.length();i++){
            System.out.println(q.charAt(i)+" "+hash[q.charAt(i)]);
        }
    }
    public static void unorderHashing(int arr[],int arr1[])
    {   HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int key=arr[i];
            int freq=0;
            
                freq=mp.getOrDefault(key,0);
                freq++;
                mp.put(key, freq);
            
        }
            for(int i=0;i<arr1.length;i++){
                if(mp.containsKey(arr1[i]))
                    System.out.println(arr1[i]+"="+mp.get(arr1[i]));
                else
                    System.out.println(arr1[i]+"="+0);
                
            }
    
    }
    public static void unorderCharacterHasing(String s,String c){
        HashMap<Character,Integer> hp=new HashMap<>();

        for(int i=0;i<s.length();i++){
            char key=s.charAt(i);
            int freq=0;
            freq=hp.getOrDefault(key,0);
            freq++;
            hp.put(key,freq);

        } 
        for(int i=0;i<c.length();i++){
            if(hp.containsKey(c.charAt(i)))
                System.out.println(c.charAt(i)+"-->"+hp.get(c.charAt(i)));
            
            else
            System.out.println(c.charAt(i)+"-->"+0);
        }      
    }
    public static void frequencyCount(int arr[]){
        boolean visited[]=new boolean[arr.length];
        for(int i=0;i<arr.length;i++){
            if(visited[i]==true){
                continue;
            }
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                visited[j]=true;     
                count++;
                }
            }
            System.out.println(arr[i]+"-->"+count);
        }
    }
    public static void countFrequency(int arr[]){
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            int key=arr[i];
            if(mp.containsKey(key)){
                int freq=mp.get(key);
                freq++;
                mp.put(key,freq);
            }
            else{
                  int freq=1;  
                  mp.put(key,freq);
            }
        }
        for(Entry<Integer, Integer> entry : mp.entrySet()){
            System.out.println(entry.getKey()+"-->"+entry.getValue());

        }

    }
    public static void freqCount(int arr[]){
        boolean visit[]=new boolean[arr.length];
        int maxfreq=0;int minfreq=arr.length;
        int maxele=0;int minele=0;
        for(int i=0;i<arr.length;i++){
            if(visit[i]==true)continue;
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    visit[j]=true;
                    count++;
                }
            }
                if(count>maxfreq){
                    maxfreq=count;
                    maxele=arr[i];

                }
                if(count<minfreq){
                    minfreq=count;
                    minele=arr[i];
                }
                
            
        }
        System.out.println(maxele+"-->"+maxfreq);
        System.out.println(minele+"-->"+minfreq);
    }
    public static void frequencycount(int arr[]){
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(mp.containsKey(arr[i])){
                mp.put(arr[i],mp.get(arr[i])+1);
            }
            else{
                mp.put(arr[i],1);
            }
        }
           int maxfreq=0;int minfreq=arr.length;
            int maxele=0;int minele=0;
        for(Entry<Integer,Integer> entry:mp.entrySet()){
            int count=entry.getValue();
            int key=entry.getKey();
            if(count>maxfreq){
                maxfreq=count;
                maxele=key;
            }
            if(count<minfreq){
                minfreq=count;
                minele=key;
            }
        }
        System.out.println(maxele+"-->"+maxfreq);
        System.out.println(minele+"-->"+minfreq);
    }
        
  
    public static void main(String args[]){
    //int arr[]=new int[]{1,2,1,2,3,4,5,1,2,7,6,4,5,3,143,143};
    //int arr2[]=new int[]{1,1,2,3,2,3,4,1};
    //int arr1[]=new int[]{1,2,3,4,5,12,323,143};
    //numberHasing(arr,arr1);
    //charecterHasing("1%jahnavi2#teja4$vineesha3@gowthami","venkatesh2143@#$%");
    //unorderHashing(arr, arr1);
    //unorderCharacterHasing("narendra","venkatesh");
    //frequencyCount(arr2);
    //countFrequency(arr2);
    //freqCount(arr2);
    //frequencycount(arr2);
}
    
 }
