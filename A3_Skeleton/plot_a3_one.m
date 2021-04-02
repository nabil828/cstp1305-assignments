close;
clear;
clc;

%A = importdata('data_linear_vs_log.txt');
A=[
%Merge Sort
%76990700, 75980200, 74999400, 72999900, 74999700, 73999500, 74018800, 74999700, 74000200, 72999700, 73000200, 79013400, 76000000, 73999500, 73999600, 73999900, 86001000, 193014400, 72000000, 74980800, 116019300, 196004300, 91999400, 74008500, 73017400, 73000300, 74990300, 74999800, 74999800, 75001300, 73000300, 73980500, 72999900, 72020100, 73009100, 72999800, 75016500, 74025600, 76122100, 72999900, 73999800, 74005900, 73001000, 73000000, 74999600, 73000200, 74001300, 75000200, 74000000, 74999700, 76999800, 73999700, 75000400, 75019500, 75999800, 75001700, 75986000, 74001100, 72999900, 76008800, 75016200, 74000200, 75972100, 76019400, 73001200, 74000500, 73999700, 73980500, 75999800, 76999900, 74999900, 75000200, 76999900, 75000200, 75000700, 77000100, 76000000, 76000000, 75999900, 78999800, 80999900, 78999800, 79000000, 76999700, 76018700, 79010700, 76000100, 80990000, 84987000, 77999700, 77999500, 82999700, 80000200, 83010300, 85000100, 79991200, 85000000, 80008500, 81000000, 77991400, 90000000, 91009700, 87008800, 85999800, 93018700, 91000100, 88999800, 93018400, 91991100, 90991400, 96992100, 100981700, 96986700, 101018300, 90991100, 91000300, 99001100, 99977800, 96000000, 101999900, 75999600, 82012400, 83077600, 85133800, 86999200, 74991100, 75013300, 76999500, 76999700, 76017800, 74001200, 75000400, 74020600, 77991500, 79990500, 75010100, 76000400, 75999700, 76000000, 77020200, 74986400, 75991300, 75009600, 74990000, 76010200, 75999700, 74999900, 75991300, 76000200, 75980400, 76000000, 74999700, 75028600, 76000100, 78971400, 76999700, 75999900, 75999800, 76000000, 76999800, 76999900, 76018500, 75999800, 77999800, 76006600, 76000000, 75000000, 75008700, 75000000, 78991800, 75999900, 74999800, 79000100, 74991000, 75993800, 75990300, 76018900, 76010200, 80012100, 75013300, 76010600, 76999900, 75991200, 77000300, 84021200, 80996900, 84018100, 80989400, 76999800, 77000200, 75019700, 76009800, 78990900, 80001400, 84008300, 76980100, 76999700, 76999700, 77000100, 77999900, 78000000, 78000200, 76999700, 80009700, 80001100, 81000200, 78000300, 81000400, 81999600, 84000400, 81018700, 78999900, 78009600, 86129500, 81000800, 88000700, 90990100, 84999600, 96999900, 95999600, 128021100, 182072700, 230000000, 260022200, 221561800, 210976000, 107999500, 92999600, 89156200, 92001800, 96000000, 93981800, 97991800, 91980500, 92999800, 104000100, 98000000, 106000100, 91000200, 96000300, 102505800, 104000800, 98999200, 102999500, 77000100, 78126100, 77001000, 77000300, 76000100, 77998900, 76999800, 77000100, 76999700, 77999600, 77999900, 78998100, 78000100, 77984400, 80010100, 77988600, 76999800, 77999600, 76999900, 78000300, 78000000, 79000100, 76001100, 76777200, 76999800, 76999900, 76000100, 78009800, 79013700, 79000000, 78000300, 79122500, 77999800, 79000000, 78000200, 78148600, 79009600, 78990700, 80997900, 78989300, 77000300, 77999800, 78000100, 76999800, 79000000, 78000000, 76999700, 78000300, 81999100, 78000000, 78000600, 77999900, 78000000, 77990400, 78000000, 78999500, 77999900, 78000300, 77980000, 78999000, 78000000, 77999600, 79000200, 78999800, 80000000, 78026800, 77001200, 80009900, 75999800, 77000100, 81009000, 77018500, 83004200, 79657500, 78000200, 78999700, 79000400, 84059800, 85005400, 80000000, 82990100, 84059900, 85000200, 86000300, 85001300, 85999600, 87999900, 81548200, 84000000, 86980600, 84014500, 84999600, 91000200, 85018400, 81984300, 86000000, 93000200, 93000100, 82000000, 84007300, 86999800, 93000000, 95000100, 87000200, 96000100, 99979600, 95000100, 96999500, 98008700, 94000200, 101999700, 103000200, 101000300, 100001400, 99999900, 106000100, 94999700, 99000200, 96999900, 96999900, 78019900, 77999800, 81000600, 79000200, 77999900, 79808600, 79000300, 79000300, 79000200, 78000000, 77980300, 78999900, 78000000, 79999900, 78999700, 80999800, 81023800, 88019100, 78999900, 80008500, 77991500, 79999900, 78991000, 78999600, 80000200, 78000600, 77999400, 79999500, 79000300, 79000200, 79999800, 78999900, 78999800, 77999900, 79000200, 79999800, 78990200, 79000000, 81000000, 79000200, 79999800, 80980700, 79999400, 81000300, 78999700, 82000200, 79999800, 80000500, 81000000, 80000000, 80999900, 81000200, 82000200, 81000000, 80016600, 81000100, 81999000, 81000100, 81019500, 84013900, 87016500, 80000100, 80000300, 80000100, 80003200, 80000100, 80000100, 84999700, 87982600, 92006600, 82006000, 80999600, 79999900, 81000100, 81000000, 80999100, 79980000, 85000400, 84000100, 82000500, 81999900, 85999900, 84999100, 83000000, 80999900, 83001800, 88999700, 91000600, 84000000, 90999200, 92999900, 87000400, 83999400, 87000300, 96002200, 95019700, 86000600, 84987700, 93000900, 102000900, 91998000, 93999900, 100000100, 96999400, 97999700, 100999900, 109000000, 103000100, 89999800, 104019500, 105018300, 106031600, 99000100, 109000500, 109999600, 108000500, 108999800, 86009700, 80000000, 80095900, 83991200, 122001600, 90006700, 111997500, 111999700, 117005000, 153008200, 135515900, 89002500, 86567200, 86999300, 82999900, 89018800, 116987900, 86988800, 96990000, 84992000, 104998800, 99998900, 90025500, 82999800, 80971500, 82002400, 96998600, 82009000, 79990400, 82000000, 82000300, 81979800, 80999700, 84003500, 99009100, 109996800, 105999300, 101004700, 110999600, 102996600, 97990300, 104003500, 113991100, 108004200, 87998400, 81014500, 80961400, 81000300, 81987100, 81989800, 81981100, 82980200, 82999800, 85999500, 84000100, 85019200, 81990000, 82000000, 81999800, 82554600, 82000200, 86000200, 82560600, 87999900, 83980100, 104004000, 106999400, 91000500, 99022000, 96009600, 83008700, 83000000, 82000100, 90018100, 82000100, 84999900, 82000200, 86991500, 82995800, 85999400, 86999700, 88999700, 85019400, 88001700, 91001300, 92989400, 84001500, 91001000, 93990300, 85999700, 90980900, 90999400, 97000000, 90000000, 86999800, 86999800, 99999800, 94991400, 97009700, 100979600, 101000000, 98000200, 99999800, 103018500, 97008300, 100009800, 110016100, 111009700, 102562000, 104015800, 110999800, 98999900, 104000300, 102000200, 93000000, 81989800, 83000200, 81990200, 84000200, 82000100, 81984700, 81999900, 83000100, 82000300, 82999600, 81990200, 81999900, 82000100, 80000100, 81990100, 82000600, 82000100, 82268200, 83010100, 82999700, 82999800, 82995200, 83000200, 82020000, 83994800, 84125500, 82000100, 81990100, 83114400, 83000800, 82991400, 81998700, 82009600, 82999600, 81990100, 81015100, 84009000, 81999900, 82990300, 83010200, 85980200, 84036000, 84001300, 84711100, 84000100, 83990100, 82999900, 81999800, 82979800, 83999700, 85001600, 82007600, 81990200, 84000200, 82991300, 81991400, 85999900, 83009700, 85000100, 83000200, 87981500, 82000000, 85000700, 84000000, 85001100, 82973800, 89991300, 88000100, 84000100, 84979900, 83999900, 83020300, 85000200, 86000300, 85980400, 84999500, 89000200, 90999500, 87999900, 88000200, 89000000, 88999900, 85028500, 95999500, 88999300, 91000300, 97001000, 89999800, 91000000, 89000000, 96999700, 97999700, 89000100, 89000100, 95999900, 98999600, 101001100, 102000900, 99999700, 100000400, 99999800, 103999800, 101999600, 107979600, 111999900, 106000200, 109000400, 109999900, 111999800, 115027200, 105001700, 115000200, 84008700, 83991500, 92008100, 100039700, 106997100, 85999600, 84019100, 85000400, 86991400, 82991500, 88012400, 85996400, 84009600, 83999900, 85999700, 86008100, 86040300, 85000000, 85991300, 86999400, 83009000, 82980000, 86001400, 84018600, 84983900, 85000000, 84998000, 84000400, 85000000, 84984100, 86000000, 85989800, 86000200, 85000300, 84999900, 84010400, 87991200, 87999800, 87991300, 87000000, 89000000, 83979900, 85999900, 87000000, 87000200, 86000300, 87018600, 88996400, 89999800, 89000100, 84980200, 86000200, 87999900, 87000000, 85999500, 87999400, 88000100, 87000100, 88028000, 85008700, 89000100, 86976200, 87016700, 84999600, 87999800, 91991700, 90200100, 84980300, 91000100, 87018600, 89001300, 96990800, 91990500, 89999400, 92998900, 89979800, 90000200, 92000600, 90000800, 89997900, 89999500, 96998500, 109999800, 113999900, 95000000, 90999800, 100000400, 96000100, 92999400, 99999600, 92000000, 91999800, 239001200, 119000900, 93979700, 100000000, 109999800, 98019700, 110009800, 111018200, 100981900, 107152300, 114001000, 111991600, 111999900, 112000200, 115000300, 111000000, 109008700, 110000000, 94000100, 90991500, 84991400, 83991400, 85000300, 86000100, 85990600, 86000000, 85999900, 85999900, 86000100, 86000300, 85980200, 87000200, 88000400, 88018600, 87000200, 85999800, 87000200, 85997500, 84985400, 86008700, 84991600, 85999900, 86999500, 85999800, 84999800, 87000300, 85999800, 86000100, 93070000, 85998100, 89108500, 89008500, 87000300, 88008700, 86000100, 86015900, 86999700, 87999200, 87000400, 86999800, 87000000, 85990200, 87000300, 87000100, 86000300, 88000100, 87987000, 87980100, 87999600, 87999900, 86999800, 87018800, 88001100, 88010300, 86000100, 88997400, 87985000, 90999800, 87008500, 87000200, 90000800, 87999900, 88980000, 94999800, 90999600, 89000400, 88020000, 90000700, 89010200, 96010200, 91990700, 93000000, 94001300, 91010000, 95000100, 96028200, 91013400, 93010000, 100018900, 92008500, 97008600, 98999400, 88980000, 100000600, 94017200, 94009600, 92000000, 95999800, 93000000, 109999900, 102989900, 103999400, 109002100, 107000100, 105999600, 112000200, 112000000, 110999700, 120125800, 110989200, 116999700, 120009600, 113000500, 113979700, 115999900, 114999600, 89000000, 89000100, 88999900, 88000400, 89999900, 90999800, 90018800, 87998600, 88000300, 90020000, 94123200, 89008400, 88001100, 90975800, 89991600, 88010200, 88008500, 87009500, 88000000, 86990300, 87000100, 91009300, 88000200, 87999600, 90014200, 89010000, 87000300, 89000100, 88999900, 89000000, 89000000, 88999700, 89000400, 89000100, 86999700, 89008000, 90972200, 89999900, 91000100, 90000200, 88001000, 88000400, 89008500, 91000100, 90999700, 89001300, 89971500, 90000000, 89000200, 90000100, 90000000, 90999700, 88999700, 88020200, 88584700, 89985500, 87981600, 88999600, 90980100, 89999700, 91000000, 88999800, 90999900, 94999900, 93000200, 92000000, 93000100, 92000300, 94000000, 93999800, 89000100, 96026700, 93999900, 92989400, 
%;

%Selection Sort
998300, 1000300, 0, 0, 0, 998500, 0, 0, 983200, 1008000, 0, 990800, 1009200, 998700, 1010200, 1000300, 999300, 984800, 996100, 1010100, 987700, 2010300, 1999500, 2001300, 3989500, 3002100, 2997700, 2992300, 3017300, 2989500, 3999000, 3010600, 3008700, 3999900, 3002200, 4000000, 5008900, 3990900, 5000100, 5009100, 4991600, 5984200, 5015600, 6008500, 6000000, 6991600, 5989300, 7018900, 6998600, 7991300, 7008600, 7981700, 7997600, 7981000, 9018900, 8991400, 10000200, 8989700, 9000100, 11000700, 10009500, 9998700, 10008500, 10991200, 11990400, 13002600, 12007100, 12009900, 12975300, 13015900, 14000000, 13010300, 14449400, 15009700, 14997200, 15010800, 15979300, 16008000, 16992400, 16999300, 17000100, 17991000, 18008900, 18999800, 19991500, 18988600, 20017700, 20992000, 20992000, 21997800, 22010200, 22008600, 22999800, 24001700, 23979700, 24019100, 25000300, 24990800, 25989900, 26018800, 26000300, 27000200, 28000000, 29006100, 28975100, 30018600, 31000000, 29000300, 29999800, 31000000, 31991500, 31972500, 33027600, 33006400, 33991500, 34989900, 34981400, 36018800, 35999900, 36979800, 38010100, 38008800, 37975400, 39015600, 39976700, 40000100, 41008000, 41995500, 42995900, 43008800, 43981200, 44009900, 45008200, 46117900, 45991600, 46998100, 47009800, 48008600, 48991400, 49999900, 51008600, 51000100, 51004300, 52997400, 53021400, 52981100, 53992400, 55006500, 54989600, 56998800, 57000000, 58000000, 58999500, 59999100, 61000400, 60998500, 62000000, 62999700, 64032400, 63998200, 64983900, 65010100, 66993000, 66015700, 68981300, 70010100, 70009900, 68991000, 71000000, 71000200, 73020800, 73988400, 72997500, 75000000, 76011400, 76999800, 76999100, 75998700, 80000100, 80999100, 82000200, 81999600, 84018700, 83010100, 83991300, 85999300, 85000300, 86000000, 87009900, 88944100, 88989700, 90999800, 91009600, 91999900, 92999700, 94000300, 95000200, 93994100, 97989800, 97999200, 98999000, 101000100, 100998900, 104000000, 102999600, 103999200, 107006300, 106118000, 107010300, 109016300, 108000300, 110000000, 111009200, 115017700, 112000200, 114981300, 117008800, 117008500, 117991500, 119148400, 117990700, 119010100, 121005700, 121990000, 122113000, 123997200, 126018900, 126000100, 127991000, 126994700, 129712400, 132003400, 133026100, 133999800, 137017000, 137006100, 138991700, 138999900, 140000100, 141989200, 142172100, 141990900, 142999900, 144001500, 145995600, 145999700, 149999600, 149000300, 149000000, 151563000, 153989200, 153008900, 157000100, 159004400, 158997300, 158979600, 162027300, 162542400, 165000100, 166117300, 166991400, 168991700, 169140400, 168984100, 170009100, 172127700, 172760100, 174009000, 181037500, 177991700, 178992500, 176009900, 182009000, 180623400, 184008600, 183000000, 187998900, 189000000, 184999800, 188000200, 193614100, 190999200, 194008800, 196992400, 196107900, 200000200, 197995700, 200133600, 201984700, 203013200, 204124300, 205009600, 209008600, 208991300, 211152600, 208991100, 213000000, 215008700, 208991600, 212980400, 218142500, 220010000, 220999900, 223123200, 223979900, 225999500, 228010900, 226019400, 231055700, 232123700, 233979600, 235999300, 239999900, 238998800, 239000600, 243998800, 244000300, 242999500, 246998900, 247998600, 247999600, 252028000, 256034300, 251989700, 255999600, 257999200, 259999800, 255085600, 256979600, 264014600, 289595000, 265026200, 270989100, 272017400, 270530300, 273999900, 272089700, 277172400, 275996100, 304012100, 296990400, 301014000, 753006900, 284994600, 286000100, 287585800, 287999300, 290999700, 293019200, 292984200, 295993200, 297999100, 296000400, 300990200, 302995400, 302009000, 308010400, 305008700, 311018700, 312000900, 315000100, 311587900, 316000600, 314000200, 320559500, 329000800, 340523400, 325991100, 323518000, 329999100, 332999200, 333010800, 331990400, 331008700, 337014300, 331015400, 335013600, 339007000, 346999300, 347030200, 346979700, 350998900, 354009700, 350000000, 349010000, 358121400, 359018400, 366033400, 361990100, 361990000, 365117800, 366561800, 371980400, 368028100, 371207700, 375009500, 374000200, 381979800, 376999900, 383000000, 387013300, 386999600, 389999200, 383999700, 389624400, 401000000, 400991600, 400970900, 394020900, 402000600, 411001400, 402984900, 399020600, 416971000, 403028600, 406999800, 416123800, 417000100, 417990000, 411999900, 417001900, 438983400, 497533900, 436002500, 460550900, 452112000, 455048000, 448990000, 491984800, 539660200, 471063400, 460465200, 463006700, 467520400, 485824900, 470640800, 506597600, 478681800, 474160300, 478441900, 471870200, 485003100, 493021000, 485937000, 485212400, 497624400, 483484400, 504434800, 489590400, 505185000, 545749600, 500608700, 511240400, 504292000, 510376700, 519133200, 527829700, 512779900, 520856900, 523887300, 522603300, 527832700, 551806000, 534175100, 532907600, 612144200, 603298000, 693151600, 667532500, 675553300, 646000200, 669004900, 552080800, 553758600, 552211800, 553467300, 557312900, 553308900, 559853600, 564510000, 577088200, 561764200, 559337800, 682872200, 796021700, 761995600, 617776800, 583149900, 596522400, 587980300, 587516700, 599018800, 591057800, 591994800, 593990400, 605010800, 625713500, 599678500, 611297600, 604263200, 618974600, 622044100, 610372900, 616992100, 626980100, 654037900, 621008400, 621804500, 637521300, 639383900, 655001900, 642990700, 643305800, 652065000, 657892200, 663538900, 648267200, 658372500, 666015800, 664014600, 675999800, 674142900, 668768900, 848161700, 809021300, 789999700, 696612700, 709005000, 685049700, 694857500, 689462700, 687101900, 693986400, 767048500, 723931600, 725989900, 717171100, 715006500, 721481100, 712111400, 707028600, 714999100, 721007900, 720637900, 715948500, 733004800, 722086300, 731079100, 748009500, 764621900, 783019700, 749519900, 746275800, 760018400, 814575200, 762000700, 770332900, 768748700, 756392200, 757002200, 776004100, 765991300, 806350800, 765576100, 806563800, 789015000, 778923900, 786587300, 796053100, 806996200, 809056100, 823989500, 827982500, 805997700, 817326500, 822441500, 822548400, 826001800, 832011100, 834017100, 827017100, 835993600, 831129100, 836004500, 835111300, 831948300, 859471500, 846296200, 979158100, 836558500, 838166500, 869012200, 885327400, 922939000, 846208300, 875995300, 854720800, 858081500, 863021000, 873839300, 937514500, 873990500, 877975700, 869011300, 868699100, 909015900, 1088700500, 1081999500, 908006400, 988345600, 917663500, 940511600, 938988400, 934040800, 935008300, 926671200, 1000008700, 910991600, 902007800, 919000000, 930009300, 937046500, 937019700, 925990000, 953988700, 973998100, 947030600, 1013019200, 950011000, 977986000, 1068005900, 983980100, 960983800, 971001800, 971899400, 977010400, 979007100;
 ];
plot(A(1,:), 'LineWidth',4);


%hold on;
%plot(A(2,:), 'LineWidth',2);

%hold on;
%plot(A(3,:), 'LineWidth',2);

%hold on;
%plot(A(4,:), 'LineWidth',2);
% set(gca,'XTickLabel',A(:,1));

set(gca, 'linewidth', 2);
set(gca, 'fontsize', 20);


leg = legend({'Selection Sort'},'Location','Northwest','FontSize',20);

xlabel('Input size n (50000 + n * 10)') 
ylabel('Runtime') 
%xticks(0:1000000:10 * 1000000)

ax = gca;
ax.FontSize = 20;
til = title('Runtime in nanoseconds','FontSize',40);
til.FontSize = 20;
% ax.YRuler.Exponent = 0;
% set(gca,'XTickLabel',A(:,1));
% ax.XRuler.Exponent = 0;
% ax.XRuler.TickLabelFormat = '%e';
% set(gca,'YTickLabel',A(:,1));

% ax.XTickLabel=num2cell(A(:,1));
% ax.XTickLabel= (A(:,1)');


% p = polyfit(A(:,1),A(:,2),1);   % p returns 2 coefficients fitting r = a_1 * x + a_2
% r = p(1) .* A(:,1) + p(2); % compute a new vector r that has matching datapoints in x

% now plot both the points in y and the curve fit in r
% hold on;
% a = plot(A(:,1), r, '-');
% a.LineWidth=2;
% a.LineStyle = '--';
% hold on;
leg = legend({'Merge Sort', 'Heap Sort'},'Location','Northwest','FontSize',20);
size(get(gca, 'XTick'));
size(get(gca, 'YTick'));

ax.FontSize = 20;