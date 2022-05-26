//import java.util.ArrayList;
//import java.util.LinkedList;
//
//public class Album {
//    private String name;
//
//    private String artist;
//
//
//
//
//    public Album(String name, String artist) {
//        this.name = name;
//        this.artist = artist;
////        this.songs= new ArrayList<Song>();
//    }
//
//    public class SongList{
//        private ArrayList<Song> songs;
//
//        public SongList() {
//            this.songs = new ArrayList<Song>();;
//        }
//        private boolean add(Song s){
//            Song t = findSong(s);
//            if (t==null){
//                this.songs.add(s);
//                return true;
//            }
//    return false;
//        }
//        public Song findSong (String title){
//            for(Song a : this.songs){
//                if(a.getTitle().equals(title))
//                    return a;
//            }
//            return null;
//        }
//
//        public Song findSong(int num){
//            if(num-1>=0 && num-1 < this.songs.size()){
////                l.add(this.songs.get(num-1));
//                return this.songs.get(num);
//            }return null;
//
//
//        }
//
////    private Song findSong(String title){
////    for(Song a : this.songs){
////        if(a.getTitle().equals(title))
////            return a;
////    }
////    return null;
////    }
////    public boolean addSong(String name, double duration){
////        Song a = findSong(name);
////        if (a==null)
////        {
////            songs.add(new Song(name, duration));
////            return true;
////        }
////            return false;
////
////    }
////    public boolean addToPlayList(int num, LinkedList l){
////        if(num-1>=0){
////            l.add(this.songs.get(num-1));
////            return true;
////        }return false;
////
////    }
////    public boolean addToPlayList(String name, LinkedList l){
////    Song a =findSong(name);
////    if(a != null){
////        l.add(a);
////        return true;
////    }return false;
////    }
//}
