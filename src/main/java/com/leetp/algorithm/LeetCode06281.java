package com.leetp.algorithm;

/**
 * @Description
 * @Author litianpeng
 * @Date 2020/6/28
 */
public class LeetCode06281 {

    public static boolean isPathCrossing(String path) {
        boolean[][] arr = new boolean[path.length() * 2 + 1][path.length() * 2 + 1];
        int x = path.length();
        int y = path.length();
        arr[y][x] = true;
        for (int i = 0; i < path.length(); ++i) {
            char c = path.charAt(i);
            if (c == 'N') {
                ++y;
            } else if (c == 'S') {
                --y;
            } else if (c == 'E') {
                ++x;
            } else if (c == 'W') {
                --x;
            }
            if (arr[y][x]) {
                return true;
            } else {
                arr[y][x] = true;
            }
        }

        return false;
    }


    public static void main(String[] args) {
        boolean re = isPathCrossing("SNWWESNNWSWESEEWWNESNWWWNSNSSSWEEESSWEESNNSWWSWSWWSWNWWNNNSSEENNSSEENSENSNENEWNNWWNSWEESSSWNNNENEEEEEWSWWWWSSSNSEWENWWENSNESWNWWENWWSNSEEWEESWWWNWWENNSSEESWEEEWSSWWWWWWSNENENNNEESEWWSWNNESSSSSNEEWNNNEWWNNNSESSNENWNSEWWNEEESESWENSNSWSSNNEEEEEEWEENSNEWWSWWWNSSNWSWNNSNWSNSNSWEENSWSNSESWWESENEWSNSNENNEWWNENSSEWNWENEENWSNWWNNWWWEWSSESSSNWWEENENWEWNSNENSNWWSSNNWSSWESENNEWWSNWWENSSNNENSEWNESWWNSENNENWSSSSESSWSWSWWNWEESEWSWENWESEESEEEEWESWNWEWENWNNWESWNWWWESSNWSSEENSEWEEWWNSSEEWENWSEWNWNSNESEWEEESWNWWNEWENENSWNEEWWWWWSNSNNSEWSWEWEEENSWSSNNSWWSNWNNENSNWEWWEEWNWNWWESEWWESNWSENEESESESSNEWWSSWNNWENSWSEESWENWNWWNENNNWNSNSENSWSSSEWNSSWSENEESNSSSSEWNNEENWSSESWNENSSWWWENEWWNENWEWEWSNWNNWWEEWNWEEENENWNNWSWNWWWEESNEEEEEEESNENNSWEESESWSSSSNNNSWNESSNNENNSWEWSSWSNSEESENEWESWSNNWWESESNESEEEEEWEESSEEWNSNNWNEEWNESNEENNENESWWSNSEEEWSEENENENNNNSNNSNESEWWSNWWNNWWESESSWSNSSEEWWWEEEWWWWSSWWNSNSSSWNSWWNENWNNSSENWSSNNWNSSNEESWNNSNSNNSWNNESESSWSSEENENNEWEWWSNESWSENNESNSNWWWNSNSEEEENNNWNSENWNENWNWENNWSWWSSSSNSWSNNEESWNNWNSESENSWWSWSSWENNWWWNEWSEWWSNNWWSEWWSESSSEESWSNSNWEESWESWNWWNEWENWWNEWWSWSEWENWNSWNSNEWENESWWWSWSEEESNWEWWWWSSEEWNNWNWSEEWWESESNESSNENWSWENSEEWNSSWNESWNENNEWNSSSWESNENSWNNWNESSWSNWWNWSEEWSNNSSNSNWEWSNESNWNESSSSESSWEENSEWESSWNEWWNNNENWNNENSNENNNWWEENSNWNWSWSENEESWESEEWNNNSNENNENWSENNNENWEEWSESNNWNSENNSNWWWSSNNWNEWWWENNNSNESENESESESNNENSWEWNSSSNNNWNENWESENWWENSWWSSNEWENNSNEWWWSWNWEWESEWWNWSWWEENNSEWWSSENSNSEWWEWEEWEWSSWWSENWSSSEENWSEEEWNWWNSNSWSWESENSNWENSEEEENWSNEEWSSNEESESNWWSWNNNWSSWENENESSWWEWNEENNSSNENSSNSENWESWWNWWSNENNWEWSWWEENESSSWWWNWEEWSWSWNNWWSSNSSEENNNNEESNWWSEWWNWWWWNEWENENSWNSENNWSWNWNWNWEWWSEWWENEEENEEESESENWENEWWNWSENSNSSWESSNEWNWENSSSNSSWWWNENNWWNEWSESWWEENENENWSSESESEESEWNEWENWWWSSNNSSSWWNSNSWEEEWSWNENENSEWESEWSWNSSNEWENNEEESWSNWSWWNSESNNEWWWEWNEWNNWSNSWEWENWNEEENESWNWWSSNSEESWENENSSWWSSWNWNENEEWEEEESNENNESSEESSWWNSSSSSESNNSSSEWWENNNSWNWNNWWNNENWSEWNWNESESNWNNSWWESSEEESSSWNSSWSWWNWWSEWWSWNWESNSWSNNESEENSWEEEEEEESSSNESWEENENNWENNENNENNWSSNSEWNSESSNWEWESWNNNWESNSNWWENESNEWNNENWSWSEWWSSNWNSWNSSSNSSNNEWSENEESWNNSWEWSESESNSSWESNNWNENENENESNNEEWWNWNWNSENESENESNNENNWSSSSWNENEEWSSWWEEWNWWEENNNNWNENSSSNWSEWNSNSESNSWEWWNEEWSNNENESEWEWENWNWNENNSNSNSEWNESSWNSNEENSWNENNSWNWEENSNWSNNESNNEEESENNWNNNSWSWNNEWENNEEWNNNWEEENNEESEENSWSEEWNWNNSSWSENESSSENEENNWSNNSWWSNNNSESNWENNSWNENSESNWESNNEWNSNEWEWWWNSWNENNNWWESEWSWNWENWEWEWNSWSWEESWNWNWWWEWEWEWESSEENWEEWSEWNEWNWNSSNNWWNSWSWESWEENSNWWSESNNNSEEWSSWSNNWEWNNSNSSNENSSNSEENEWENENSNEESSNENSSEEWESENWNSENWSENNEWSEESWNESWEESWEWSSNESESENSNESSWSEWNESSWSWWENSWWNESSWNEWWNSWEESWNSESESWWNWNSSSSSWWEENNNWEWNWNWESNSNWSESNWNSSEWESENSWNSNNWWNNSWSSNESEWENNSESSWSNWNESWSWESWSEWWNSWSNNSWWSNSNNESWSSESNENSESEWWSENWEWSSWSNWEWSWNEWNWEESNSNNSEWNNNWNWENNWWNSSNWSSSNNWNNWWWSSSENNWSNEESNENEEEEENNNNNWWEEWSWSWNNNWNEESWEENSEEEESWWSNWENENWENNNNSWSEWSSNNWNNENESESENEESWWSSEEWEEWNNNNNSEESWWEENSESWWSEWEEWSNEWSSNSNNWSNSNWNSWENWWSWWSNESESENNWSSNESESSSSSESWSENSWNSWNSWWEWNSEWWSSWESWSWWSWWSSSNSESEENNSWSNWEWSEWSNWESSSSNWSSSNWWWESNEWNWWWENSNEWESNSNWSSSEENSESWNNSSNWWEWENWSNNSSESEWNSNWWWWEWNESESNWNSENNENNEESWENEENNSESESEEWSSSSNNNSSWWNWNWNENESNSSSNWWEEWNSWWESSEWESSNSEWNWNSEWWEWSNWSSESSSNSENWNNNENEEWWNSSSSWEWSSWNSNSWWSNWNSWNEEENSWNWWWNNWWWSWNNNENNNSWNENENWEEESENSSESEENNNNWSWNSWSEWWNNEWWWWSENENEWNEENESNNNNNSSSNSESSSEEWEWSWWEENESSSEWSWSNWESNWNESSWNWSSNNSWNWEWNSSWWSSSESNESWWNNEENNESSSEESWSWWWSESEWWNEESEWSENSSENSSWWWSESSENESEWENWNWSWESNNNSSSSSEWWNNNEWNSEEWSNNNNENNESWEESWSSNWSNEWWSSWSSEWEEWNEEWENEWSSNWWWSNWENESSWNNWSWSNESEEWENNSNESNEEESENWNSWNNSEEWWENNWNSNWNSENWENENWWNSWSNENNEENSNNEWWESENEWNWSSNNSESNSEEEWWSSESEWEEEWSESSSENENSNNWWNSEEWNSNNEEWSSWENWNNNEWSEEWENWNENNWWWEWSEWSSNSWWSEEWESNESNWEWWNSSWNWSNENNWEWNNWENEESWEEEWWNEWWNNSWWWWESNSNNNSWWSENESNNWNWWNNNENSEWSWNWNSEESSWSSWNESWSNSNNESSNWNNWWSEWSEESNNWSNWSWWSSNNSNNNSWNSNWEWWENNENNNWNWSEWSNWWNWWEWWEWSENEEWWEWSWSESNSSSSWENNWNWESNSWSNNSWWNSENWNWENNWEEWWWEWEEEESSEEWSSEEEWNNNNEEWSWNNENWEEWNSENNSSSNEEEEWNEWWWNEEWNEWWSWNEWNWNEESSNSWWSSEENNNSEWESNWWSNNENWNWWWWNNSNNENSESWEWNNSWNESSEWNWWEEEENESNSWNSWNSNNSSNNNNNNSSEENWSNSWWNSWWNESEESNSWENSEESWEESSSSWWENSEENEWSEWSEENEWNSWEWEWNWEEENWESEESNNEEENSWEWSSSSNWWSWSENSSENWWEEESESSNESENWWSESESWWWEESEESESSNNSSWSEESENESWWWSNNNNENESEESSNWSWNSNSESENWWEWEWWNWSWWSNWSEWWEENENWSSWNSSWEESSENEENNWNWWSEEEWNSNNEWSWSNENNENENEEESWSSSESENWWWNNESEESSWWWWNEWNWENEENNESESENWENENNSWWESSSNNSSENSNEWNWSNNEWNSSSWSWWWSSENSSSSNWSNEWWEESSNWSNWWEENSENENEENSENWSSSENENNENSWNWWENNEWEENSWEESESWSSWEESSSNENENEEWENENSSWEWNEWNSEESEWSESENNNENEWSWSEWSWEEEENENENSWNNEWSEENWNSWWNWNEENEEEWNENNSWENSSNSEWESWESWWNNNSEESSSSEESWWNWESWSESWSEENSSSSWWNWEWEESESESSWWSWSNESWESNNSSSWSSESENSWWNWSEWWNENSESSWEWWNENENESWNEEWWNSESEEWNWEENEWWEWSSWNNNWNESWWSSEWSENNSWNNNNWESNNWSSSWWNEWEWNEWSSEEWWWWWWSSWNSSNESNNNENNEWSWNSEEEENWNNSSSESSENSSSNWWSEWWWENNSWWWWSNWENSESWNNWNEEWSSWSSSNEWSSNSWWEESESWSSSESNWNSESNNNWSEWNWEWNEESSEEEWEEWNNSNWNENEEENNWNNESWNSWSESSWNNWSESWNEENWNNWNSNWNNNNWEESWESWWWSWWESNWNWWEEWSNSWNNENWESEEWWESSNESEWEWEWNENESSENEEESNNSENWSWNSWEENEWEWWESSWNSWESENNWESNWWNEWWNEENWENSEWEESEESSESNWWWWEEENNNNSNENWNNWEWNNWWSSNEEENENWSSENWWEESEWSSWNWWNSSWEWENSESSNNNENNWSWEENSNNESWNEWWWNNEENSNWWEWEENWNWWENWNWSESWNSWSWENSNNWEWEESSSWEWNNSNSNWWSNWSNSWNSSEWSENNNSSENNWNNNWNSSNSWWENEENSNWSNSWEEEWWSWESNESENEEWEESWSNSNWNEEWSSWENSNWWSNSENWESNNNEEWSNSNNNENEEWNSWSWSNSWNSNESEWEWSEEWENWSENEEWNEESNWSESEWSSSEENEWENSWWNNSSNNESSSSNWNSSWNWNWNWSWWENSWWWWENEWWENENWSWWEEWNSWWWWWNWESEWNEENSESSSNWEENWSNWESENNWNSNNESESWENSSNEWWSNWNSNEESWSSSWWSENSSSWNWNSEEWSNSEWSWWSWWWNNSSWWWNSSESNSNNSSSSEESSSENWWNNNSSSWSNSESNSESNWNNSNWWWWWNEEESEWWSNWNWSENSSESEESSNEESSWENSESNSWWEEENESEWNESNEESENSESSEENWWSSEEEWSWWEEWSEEEESESEWSSSNWSNNWWSWSEWWSEEWESWSSNENSNWENNEEWWWNSNSEENWSNENSWNNSESNEEWNSSSSNNWEEWSWSWWSSWWSSWEWWWWWEWEEWNSWNNENEESNEEWSNNEWWSSSWSSSWWNNENNWSEWEWEEESNESNESEEEWSNSEEWEWNSEESENNSWNEWWEWNWSWSWWEWWNENSNWEWENNESSWWSESSWSEWESWNWWWWSWWNWNSNSWWEENSSWSWESESWEESSNSNNSWNNENNWWNWWNWNWESSWWWWWWNENEWSSWWWNENSNEESWNENNWWEWWENENEENWNNNSSEENWNENNWWEWNSSSWWWWNSESWSESSSNENSSENWEWWNWWWESWENNNSWENSNNNWSNESNSWSSSEWENSWNWENEWSEWEESEEESWENWNWNSENEENEEWNEWSNNSNWWSSNEWNWEWESESEESWENWNSSNESENWNWNSNENENWSNWWWSNWSSESNEWENENWWSSNNNENESSSNEENENENWEWWWWNNNESSSNEEEEESNESEWSSNWESWSWWSESEWEEENNESWSWEWSNEWSNWEEWWESNSSSSNWWSSESEWSESESEWWNWSNWSNNSENSEENNSSNSSNEEESEWWNEEWSWNNSESNENNWSWENSSNWNEWNSNSESEWNNWENSWSWWNENNSSWWNWWNNWEWNSEEENWSNEWNWWSEEWSESNNNNWWSSWNWNNNSSNEESEWSNENSNNEENNWNNNWNWWSWSWWWEEEWSSSEWESESENSEESNNWSWWNEEWSNWWSWSWESSEEWESEEWWSENNNNSSWENNNWEWNNWESSEESSNWNSSEWNSEEEWSESWWSNWSWNNSENENNWENEWENENWEWNNNEENESNWEWWNSNEWSESNWESENNWENWWESWNEWWSSESNSWSWWWWSEENSSSSWWEWWSNSSSNSNSEESEESNNNSENEWWEESNWWENSNSNESEEEWNWSNNSENEEWEWEEENNWESNSESEWSNEENNSWWWNNSEWSWWSWNSSENENWESSWWWWSESWWWWSSWNWNNEWEENWWEEWESSSWNEWSNEWWSWWNEWNWNEEEENSEESSESNWEWWNWSNWEEEENSSEWNWENWNSNEENSWEWWSENENNWNSWSESNNNESNWWESWSWEWSEENWWWEEEESENEEEWEEWSNSENNWNNEEEESESWSWENWENESSWEESSSSSESWWSEWEEESNENEWSSNEEENWNSSSNNNESEWSNSESEESNNWNESENSNSNNEESNSWNSSSNSSWEESSWWWSSNSSSNESESESEESENESWSEENENNWWEWWWSWWNEENWEWSENWSSEEEWNEWNWWNWENNWWWNWNEEEEEWWNSNENESNWEESEWEWSENSSSWEWEESEEEEWNNSNESNEESSSSSSWSWWNNSEWENNNWNENNWWNWNNWSWNESESWNNNNSNWEWSWSNWEWSEEENSESENWENESWWSNNSSNESESEESSEEWSNWNWEEWESNENENEESSWWNEEESSWEWWWEEEEWWNWNEEWEWEEWESNNEEENEENENEEENNWWWWESSWEEESSWSWNEESESSNWSSWWEEEENNNWEEWNWWSNWSWWSSWENNNNNSENSEENWWNNSNNWWWENNNWNNENSENESSESNNNSEEEEWNESENSWNSWNWWESWWWSEEEWNNNSSNEWNWEWSSSWNEEEENNWEWEENESSNSNEESWNNEWWEWWNSWNSWWNWWNNESENWWNSSWNEESWEWSSWNSNWSNNEWENSEEESWSNSNNNSNESEEEWEWWWWWSSENWNEESWENWSNNWWWNWWSNEWSNENWSNSEESNWEWEWSWESENWSSNNNSNEWESWEESNWNEWNESSSEWEWWWSSEWSSNWNEEWEEWSEENSWSNENNSEWNNEWNWEEEWEWNWWSSNWSSNNNSNESSNSSNNNSSENNSNSSENWWWSSESNWENSSWSNNESSNESSEENSNSWNWSESNWEWSSENEESSNSENEWSSNEESEESWWESNSWNWSWESESWWWESNNSENWENWWNNWENNSSEESEWNNWENSNWSNNWSESWWSNSESEENSESNSEESSNWSSNWWWSEESNSWESSSEWNEEWEENSWEENESNWNSESESEWEESENSEWENSWNNEWSEEEWNNWWWWWESWEWNNENEESWSSEWNEWWSWWSNNEWEWNNSSSEWWWEEWWSESSNSWNEWSWWEWENENWEENNNWSSNSSEWWWWWEWWSEEESENWNWESNENESSNESSNNNWWSWSENSWWWNWSENNEWEEEWWNEWNSWESSSESWWESNWSNNWSSNWWSNWEWWWWSESEWSSSNNWSWSSESNNSWSESESWEESWEWESEEWSESWSENNNSWEWWWWSNNNESNNSEESNSWSEWEWSWSNNNSWSWNNWEWSSWSSSWNNENSWNENENSNEEENEEEENSNSNWWNSNEWSSNWNSWNSSEESSWNEEESWWWNNNNWNWSSWSWNWEWNEWESESSENWESWEEWSWSESEWSNENWNWENNSNNWNSEWESEWWWWNWWNWENSENNWWNWNWNNWWWWEWSNEWSNNWSSWNESEEEWWWWESNWEWEEEWNWWSEESNENWWEWEWWNWNNWSEWNNNNNNSSNSESSWEWWNESSENESWEWSSWENSSSEWESNNWSNNSEEWWNSSEWSSNNWEWENNSSWEWWWSNSSSEWSESWWNWNSWNNEENEWWENWNSWSWWENWWSNWSWEESWSNSNSWEWNNWNNESEEESEWSSWNNEWWNENNESWNWENSEWNWNWEWNNWNNSSWWESNWWWEWNSWNSENSEEWSSNWEEENWENNNEENSSESEWSNSEESWWWWWNNWWNWNEENNSEESEEEWNESENWWNESENSWEEWNNNNSSSNNSWWWWNNNEEEWSENNEEEESWSESNNEEESNNENESEWWSSSNWEENWNESNESENNWESSSWNWSWNNWEEENEWNNSWNWWNNENWENWSWSSWEWEWNEWSWNWWEEESWWSWWWWWWESWNWNEWEENENSEENNNEENSESWWSWNSNNENSESNSSNSENNNNWENEESNNENWNSNEWSSSEWEWENWEEWWEWSWNEEEENENNESWSNSSNNWEEEWSEWNNSENNENWNENSNENEWWSENNWWESWNWWESESWNEENSEWNSWSWESENENWSNNNWNNSWSESEENSNESSSNNNWENNNSESEWWNSESSWENWWWENWEWNNSSNWSENSEWNSEENWSEESNNWNEEESNEEWWSSWEWWNEWENESSESWSSESWNESNNEENNWEESSNNSSNNWNNSSEEWSNWNNEENNWSEEWNWESWSSWESNWEWEEEEWSNNSESNWWWEEENENNEWSNSEWEWSWNSNNNSNWWEWSSEEWWNNSWENSENSWSNSNWESWENENNSWNEWEESNSWEWEWSNSSEWNSEESSWWSSEWWENNNESWNWWNESNWWWNWWWWESNENSSWESESSWSSEWESNWWSNESSEWSNSWESSSSWEENSWWSNWEEENEWWEWNSSEEEEEEESESWSNEEEENSENEENSWSENNENWSNNSEEWEWENNSSNSWWNENEWSSESENSESNEWSNSNNWSNNSWSSEWESEESESWSNNWNSESNNEWWWESESEEWWNNNSWENSWNEEEEWSSWNNNWNSSNENEEWWNSNEWESNWNSSSSNWEEEWNSESEENWEENENNSEWWEWNWENSNSSWSSSENENNWESSNNSSENNSWWWESSSENNNEWEEEWENWSNSEESEEEENSNNWWNWWWNSENEWEESNWEESNNENENESWNNENEWWWSENSWESSSEENSS");
        System.out.println(re);
    }
}