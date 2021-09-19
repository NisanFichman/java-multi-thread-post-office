
public class Outputs {
	
	/*
	 * 
	 
Creating Branch -1, branch name:HUB, packages: 0, trucks: 0
Creating StandartTruck [truckID=2000, licensePlate=489-78-535, truckModel=M4, available= true,maxWeight=200]
Creating StandartTruck [truckID=2001, licensePlate=245-78-797, truckModel=M2, available= true,maxWeight=300]
Creating StandartTruck [truckID=2002, licensePlate=639-41-991, truckModel=M0, available= true,maxWeight=200]
Creating StandartTruck [truckID=2003, licensePlate=601-53-123, truckModel=M4, available= true,maxWeight=200]
Creating NonStandardTruck [truckID=2004, licensePlate=730-50-386, truckModel=M2, available= true, length=1400, width=400, height=300]

Creating Branch 0, branch name:Branch 0, packages: 0, trucks: 0
Creating Van [truckID=2005, licensePlate=245-82-131, truckModel=M4, available= true]
Creating Van [truckID=2006, licensePlate=227-81-261, truckModel=M3, available= true]
Creating Van [truckID=2007, licensePlate=451-88-283, truckModel=M2, available= true]
Creating Van [truckID=2008, licensePlate=844-86-387, truckModel=M0, available= true]

Creating Branch 1, branch name:Branch 1, packages: 0, trucks: 0
Creating Van [truckID=2009, licensePlate=664-89-982, truckModel=M2, available= true]
Creating Van [truckID=2010, licensePlate=490-81-538, truckModel=M4, available= true]
Creating Van [truckID=2011, licensePlate=221-57-222, truckModel=M1, available= true]
Creating Van [truckID=2012, licensePlate=496-42-947, truckModel=M3, available= true]

Creating Branch 2, branch name:Branch 2, packages: 0, trucks: 0
Creating Van [truckID=2013, licensePlate=756-94-535, truckModel=M0, available= true]
Creating Van [truckID=2014, licensePlate=674-50-149, truckModel=M2, available= true]
Creating Van [truckID=2015, licensePlate=281-27-921, truckModel=M1, available= true]
Creating Van [truckID=2016, licensePlate=620-36-155, truckModel=M3, available= true]

Creating Branch 3, branch name:Branch 3, packages: 0, trucks: 0
Creating Van [truckID=2017, licensePlate=937-47-877, truckModel=M2, available= true]
Creating Van [truckID=2018, licensePlate=116-73-291, truckModel=M3, available= true]
Creating Van [truckID=2019, licensePlate=186-56-380, truckModel=M3, available= true]
Creating Van [truckID=2020, licensePlate=151-57-873, truckModel=M4, available= true]

Creating Branch 4, branch name:Branch 4, packages: 0, trucks: 0
Creating Van [truckID=2021, licensePlate=577-76-147, truckModel=M2, available= true]
Creating Van [truckID=2022, licensePlate=911-61-535, truckModel=M4, available= true]
Creating Van [truckID=2023, licensePlate=838-48-467, truckModel=M1, available= true]
Creating Van [truckID=2024, licensePlate=218-85-544, truckModel=M2, available= true]


========================== START ==========================
00:00
Creating NonStandardPackage [packageID=1000, priority=STANDARD, status=CREATION, startTime=, senderAddress=4-466320, destinationAddress=3-979005, width=237, length=458, height=119]
StandardTruck 2000 loaded packages at HUB
StandardTruck 2000 is on it's way to Branch 0, time to arrive: 9
StandardTruck 2001 loaded packages at HUB
StandardTruck 2001 is on it's way to Branch 1, time to arrive: 5
StandardTruck 2002 loaded packages at HUB
StandardTruck 2002 is on it's way to Branch 2, time to arrive: 5
StandardTruck 2003 loaded packages at HUB
StandardTruck 2003 is on it's way to Branch 3, time to arrive: 2
NonStandardTruck 2004 is collecting package 1000, time to arrive: 1
00:01
NonStandartTruck 2004has collected package 1000
NonStandartTruck 2004 is delivering package 1000, time left: 1
00:02
StandardTruck 2003 arrived to Branch 3
StandardTruck 2003 unloaded packages at Branch 3
StandardTruck 2003 loaded packages at Branch 3
StandardTruck 2003 is on it's way to the HUB, time to arrive: 3
NonStandartTruck 2004has delivered package 1000 to the destination
00:03
00:04
00:05
StandardTruck 2001 arrived to Branch 1
StandardTruck 2001 unloaded packages at Branch 1
StandardTruck 2001 loaded packages at Branch 1
StandardTruck 2001 is on it's way to the HUB, time to arrive: 6
StandardTruck 2002 arrived to Branch 2
StandardTruck 2002 unloaded packages at Branch 2
StandardTruck 2002 loaded packages at Branch 2
StandardTruck 2002 is on it's way to the HUB, time to arrive: 6
StandardTruck 2003 arrived to HUB
StandardTruck 2003 unloaded packages at HUB
StandardTruck 2003 loaded packages at HUB
StandardTruck 2003 is on it's way to Branch 4, time to arrive: 2
00:06
00:07
StandardTruck 2003 arrived to Branch 4
StandardTruck 2003 unloaded packages at Branch 4
StandardTruck 2003 loaded packages at Branch 4
StandardTruck 2003 is on it's way to the HUB, time to arrive: 5
00:08
00:09
StandardTruck 2000 arrived to Branch 0
StandardTruck 2000 unloaded packages at Branch 0
StandardTruck 2000 loaded packages at Branch 0
StandardTruck 2000 is on it's way to the HUB, time to arrive: 3
00:10
Creating StandardPackage [packageID=1002, priority=LOW, status=CREATION, startTime=, senderAddress=4-214283, destinationAddress=1-580249, weight=5.796479225158691]
Van 2021 is collecting package 1002, time to arrive: 4
00:11
StandardTruck 2001 arrived to HUB
StandardTruck 2001 unloaded packages at HUB
StandardTruck 2002 arrived to HUB
StandardTruck 2002 unloaded packages at HUB
StandardTruck 2001 loaded packages at HUB
StandardTruck 2001 is on it's way to Branch 0, time to arrive: 4
StandardTruck 2002 loaded packages at HUB
StandardTruck 2002 is on it's way to Branch 1, time to arrive: 1
00:12
StandardTruck 2000 arrived to HUB
StandardTruck 2000 unloaded packages at HUB
StandardTruck 2002 arrived to Branch 1
StandardTruck 2002 unloaded packages at Branch 1
StandardTruck 2002 loaded packages at Branch 1
StandardTruck 2002 is on it's way to the HUB, time to arrive: 3
StandardTruck 2003 arrived to HUB
StandardTruck 2003 unloaded packages at HUB
StandardTruck 2000 loaded packages at HUB
StandardTruck 2000 is on it's way to Branch 2, time to arrive: 7
StandardTruck 2003 loaded packages at HUB
StandardTruck 2003 is on it's way to Branch 3, time to arrive: 2
00:13
00:14
StandardTruck 2003 arrived to Branch 3
StandardTruck 2003 unloaded packages at Branch 3
StandardTruck 2003 loaded packages at Branch 3
StandardTruck 2003 is on it's way to the HUB, time to arrive: 4
Van 2021 has collected package 1002 and arrived back to branch 4
00:15
Creating SmallPackage [packageID=1003, priority=LOW, status=CREATION, startTime=, senderAddress=0-1057564, destinationAddress=1-501399, acknowledge=false]
StandardTruck 2001 arrived to Branch 0
StandardTruck 2001 unloaded packages at Branch 0
StandardTruck 2001 loaded packages at Branch 0
StandardTruck 2001 is on it's way to the HUB, time to arrive: 1
StandardTruck 2002 arrived to HUB
StandardTruck 2002 unloaded packages at HUB
StandardTruck 2002 loaded packages at HUB
StandardTruck 2002 is on it's way to Branch 4, time to arrive: 8
Van 2005 is collecting package 1003, time to arrive: 5
00:16
StandardTruck 2001 arrived to HUB
StandardTruck 2001 unloaded packages at HUB
StandardTruck 2001 loaded packages at HUB
StandardTruck 2001 is on it's way to Branch 0, time to arrive: 5
00:17
00:18
StandardTruck 2003 arrived to HUB
StandardTruck 2003 unloaded packages at HUB
StandardTruck 2003 loaded packages at HUB
StandardTruck 2003 is on it's way to Branch 1, time to arrive: 6
00:19
StandardTruck 2000 arrived to Branch 2
StandardTruck 2000 unloaded packages at Branch 2
StandardTruck 2000 loaded packages at Branch 2
StandardTruck 2000 is on it's way to the HUB, time to arrive: 5
00:20
Creating SmallPackage [packageID=1004, priority=HIGHT, status=CREATION, startTime=, senderAddress=1-545636, destinationAddress=0-670300, acknowledge=false]
Van 2005 has collected package 1003 and arrived back to branch 0
Van 2009 is collecting package 1004, time to arrive: 7
00:21
StandardTruck 2001 arrived to Branch 0
StandardTruck 2001 unloaded packages at Branch 0
StandardTruck 2001 loaded packages at Branch 0
StandardTruck 2001 is on it's way to the HUB, time to arrive: 6
00:22
00:23
StandardTruck 2002 arrived to Branch 4
StandardTruck 2002 unloaded packages at Branch 4
StandardTruck 2002 loaded packages at Branch 4
StandardTruck 2002 is on it's way to the HUB, time to arrive: 2
00:24
StandardTruck 2000 arrived to HUB
StandardTruck 2000 unloaded packages at HUB
StandardTruck 2003 arrived to Branch 1
StandardTruck 2003 unloaded packages at Branch 1
StandardTruck 2003 loaded packages at Branch 1
StandardTruck 2003 is on it's way to the HUB, time to arrive: 4
StandardTruck 2000 loaded packages at HUB
StandardTruck 2000 is on it's way to Branch 2, time to arrive: 8
00:25
Creating StandardPackage [packageID=1005, priority=HIGHT, status=CREATION, startTime=, senderAddress=3-863980, destinationAddress=2-469230, weight=4.6328020095825195]
StandardTruck 2002 arrived to HUB
StandardTruck 2002 unloaded packages at HUB
StandardTruck 2002 loaded packages at HUB
StandardTruck 2002 is on it's way to Branch 3, time to arrive: 2
Van 2017 is collecting package 1005, time to arrive: 1
00:26
Van 2017 has collected package 1005 and arrived back to branch 3
00:27
StandardTruck 2001 arrived to HUB
StandardTruck 2001 unloaded packages at HUB
StandardTruck 2002 arrived to Branch 3
StandardTruck 2002 unloaded packages at Branch 3
StandardTruck 2002 loaded packages at Branch 3
StandardTruck 2002 is on it's way to the HUB, time to arrive: 3
StandardTruck 2001 loaded packages at HUB
StandardTruck 2001 is on it's way to Branch 4, time to arrive: 3
Van 2009 has collected package 1004 and arrived back to branch 1
00:28
StandardTruck 2003 arrived to HUB
StandardTruck 2003 unloaded packages at HUB
StandardTruck 2003 loaded packages at HUB
StandardTruck 2003 is on it's way to Branch 0, time to arrive: 4
00:29
00:30
Creating StandardPackage [packageID=1006, priority=STANDARD, status=CREATION, startTime=, senderAddress=4-770164, destinationAddress=4-1006520, weight=5.442949295043945]
StandardTruck 2001 arrived to Branch 4
StandardTruck 2001 unloaded packages at Branch 4
StandardTruck 2001 loaded packages at Branch 4
StandardTruck 2001 is on it's way to the HUB, time to arrive: 2
StandardTruck 2002 arrived to HUB
StandardTruck 2002 unloaded packages at HUB
StandardTruck 2002 loaded packages at HUB
StandardTruck 2002 is on it's way to Branch 1, time to arrive: 9
Van 2021 is collecting package 1006, time to arrive: 5
00:31
00:32
StandardTruck 2000 arrived to Branch 2
StandardTruck 2000 unloaded packages at Branch 2
StandardTruck 2000 loaded packages at Branch 2
StandardTruck 2000 is on it's way to the HUB, time to arrive: 5
StandardTruck 2001 arrived to HUB
StandardTruck 2001 unloaded packages at HUB
StandardTruck 2003 arrived to Branch 0
StandardTruck 2003 unloaded packages at Branch 0
StandardTruck 2003 loaded packages at Branch 0
StandardTruck 2003 is on it's way to the HUB, time to arrive: 2
StandardTruck 2001 loaded packages at HUB
StandardTruck 2001 is on it's way to Branch 2, time to arrive: 9
00:33
00:34
StandardTruck 2003 arrived to HUB
StandardTruck 2003 unloaded packages at HUB
StandardTruck 2003 loaded packages at HUB
StandardTruck 2003 is on it's way to Branch 3, time to arrive: 9
00:35
Creating NonStandardPackage [packageID=1007, priority=STANDARD, status=CREATION, startTime=, senderAddress=2-828998, destinationAddress=3-391995, width=173, length=460, height=283]
NonStandardTruck 2004 is collecting package 1007, time to arrive: 9
Van 2021 has collected package 1006 and arrived back to branch 4
00:36
00:37
StandardTruck 2000 arrived to HUB
StandardTruck 2000 unloaded packages at HUB
StandardTruck 2000 loaded packages at HUB
StandardTruck 2000 is on it's way to Branch 4, time to arrive: 3
00:38
00:39
StandardTruck 2002 arrived to Branch 1
StandardTruck 2002 unloaded packages at Branch 1
StandardTruck 2002 loaded packages at Branch 1
StandardTruck 2002 is on it's way to the HUB, time to arrive: 4
Van 2005 is delivering package 1003, time left: 10
Van 2009 is delivering package 1002, time left: 10
00:40
Creating SmallPackage [packageID=1008, priority=HIGHT, status=CREATION, startTime=, senderAddress=4-1098997, destinationAddress=4-993421, acknowledge=true]
StandardTruck 2000 arrived to Branch 4
StandardTruck 2000 unloaded packages at Branch 4
StandardTruck 2000 loaded packages at Branch 4
StandardTruck 2000 is on it's way to the HUB, time to arrive: 2
Van 2021 is collecting package 1008, time to arrive: 8
00:41
StandardTruck 2001 arrived to Branch 2
StandardTruck 2001 unloaded packages at Branch 2
StandardTruck 2001 loaded packages at Branch 2
StandardTruck 2001 is on it's way to the HUB, time to arrive: 1
Van 2013 is delivering package 1005, time left: 1
00:42
StandardTruck 2000 arrived to HUB
StandardTruck 2000 unloaded packages at HUB
StandardTruck 2001 arrived to HUB
StandardTruck 2001 unloaded packages at HUB
StandardTruck 2000 loaded packages at HUB
StandardTruck 2000 is on it's way to Branch 0, time to arrive: 4
StandardTruck 2001 loaded packages at HUB
StandardTruck 2001 is on it's way to Branch 1, time to arrive: 1
Van 2013 has delivered package 1005 to the destination
00:43
StandardTruck 2001 arrived to Branch 1
StandardTruck 2001 unloaded packages at Branch 1
StandardTruck 2001 loaded packages at Branch 1
StandardTruck 2001 is on it's way to the HUB, time to arrive: 1
StandardTruck 2002 arrived to HUB
StandardTruck 2002 unloaded packages at HUB
StandardTruck 2003 arrived to Branch 3
StandardTruck 2003 unloaded packages at Branch 3
StandardTruck 2003 loaded packages at Branch 3
StandardTruck 2003 is on it's way to the HUB, time to arrive: 3
StandardTruck 2002 loaded packages at HUB
StandardTruck 2002 is on it's way to Branch 2, time to arrive: 1
00:44
StandardTruck 2001 arrived to HUB
StandardTruck 2001 unloaded packages at HUB
StandardTruck 2002 arrived to Branch 2
StandardTruck 2002 unloaded packages at Branch 2
StandardTruck 2002 loaded packages at Branch 2
StandardTruck 2002 is on it's way to the HUB, time to arrive: 3
NonStandartTruck 2004has collected package 1007
NonStandartTruck 2004 is delivering package 1007, time left: 1
StandardTruck 2001 loaded packages at HUB
StandardTruck 2001 is on it's way to Branch 3, time to arrive: 4
00:45
Creating SmallPackage [packageID=1009, priority=STANDARD, status=CREATION, startTime=, senderAddress=4-524786, destinationAddress=0-833458, acknowledge=false]
NonStandartTruck 2004has delivered package 1007 to the destination
Van 2022 is collecting package 1009, time to arrive: 7
00:46
StandardTruck 2000 arrived to Branch 0
StandardTruck 2000 unloaded packages at Branch 0
StandardTruck 2000 loaded packages at Branch 0
StandardTruck 2000 is on it's way to the HUB, time to arrive: 3
StandardTruck 2003 arrived to HUB
StandardTruck 2003 unloaded packages at HUB
StandardTruck 2003 loaded packages at HUB
StandardTruck 2003 is on it's way to Branch 4, time to arrive: 5
00:47
StandardTruck 2002 arrived to HUB
StandardTruck 2002 unloaded packages at HUB
StandardTruck 2002 loaded packages at HUB
StandardTruck 2002 is on it's way to Branch 0, time to arrive: 3
00:48
StandardTruck 2001 arrived to Branch 3
StandardTruck 2001 unloaded packages at Branch 3
StandardTruck 2001 loaded packages at Branch 3
StandardTruck 2001 is on it's way to the HUB, time to arrive: 1
Van 2021 has collected package 1008 and arrived back to branch 4
00:49
StandardTruck 2000 arrived to HUB
StandardTruck 2000 unloaded packages at HUB
StandardTruck 2001 arrived to HUB
StandardTruck 2001 unloaded packages at HUB
StandardTruck 2000 loaded packages at HUB
StandardTruck 2000 is on it's way to Branch 1, time to arrive: 1
StandardTruck 2001 loaded packages at HUB
StandardTruck 2001 is on it's way to Branch 2, time to arrive: 10
Van 2005 has delivered package 1003 to the destination
Van 2009 has delivered package 1002 to the destination
00:50
Creating NonStandardPackage [packageID=1010, priority=STANDARD, status=CREATION, startTime=, senderAddress=3-359855, destinationAddress=1-271216, width=579, length=406, height=71]
StandardTruck 2000 arrived to Branch 1
StandardTruck 2000 unloaded packages at Branch 1
StandardTruck 2000 loaded packages at Branch 1
StandardTruck 2000 is on it's way to the HUB, time to arrive: 3
StandardTruck 2002 arrived to Branch 0
StandardTruck 2002 unloaded packages at Branch 0
StandardTruck 2002 loaded packages at Branch 0
StandardTruck 2002 is on it's way to the HUB, time to arrive: 3
Van 2005 is delivering package 1004, time left: 1
00:51
StandardTruck 2003 arrived to Branch 4
StandardTruck 2003 unloaded packages at Branch 4
StandardTruck 2003 loaded packages at Branch 4
StandardTruck 2003 is on it's way to the HUB, time to arrive: 4
Van 2005 has delivered package 1004 to the destination
Van 2021 is delivering package 1006, time left: 1
00:52
Van 2021 has delivered package 1006 to the destination
Van 2022 has collected package 1009 and arrived back to branch 4
00:53
StandardTruck 2000 arrived to HUB
StandardTruck 2000 unloaded packages at HUB
StandardTruck 2002 arrived to HUB
StandardTruck 2002 unloaded packages at HUB
StandardTruck 2000 loaded packages at HUB
StandardTruck 2000 is on it's way to Branch 3, time to arrive: 5
StandardTruck 2002 loaded packages at HUB
StandardTruck 2002 is on it's way to Branch 4, time to arrive: 2
00:54
00:55
Creating NonStandardPackage [packageID=1011, priority=HIGHT, status=CREATION, startTime=, senderAddress=2-1008027, destinationAddress=4-881538, width=898, length=311, height=94]
StandardTruck 2002 arrived to Branch 4
StandardTruck 2002 unloaded packages at Branch 4
StandardTruck 2002 loaded packages at Branch 4
StandardTruck 2002 is on it's way to the HUB, time to arrive: 2
StandardTruck 2003 arrived to HUB
StandardTruck 2003 unloaded packages at HUB
StandardTruck 2003 loaded packages at HUB
StandardTruck 2003 is on it's way to Branch 0, time to arrive: 1
00:56
StandardTruck 2003 arrived to Branch 0
StandardTruck 2003 unloaded packages at Branch 0
StandardTruck 2003 loaded packages at Branch 0
StandardTruck 2003 is on it's way to the HUB, time to arrive: 6
00:57
StandardTruck 2002 arrived to HUB
StandardTruck 2002 unloaded packages at HUB
StandardTruck 2002 loaded packages at HUB
StandardTruck 2002 is on it's way to Branch 1, time to arrive: 8
00:58
StandardTruck 2000 arrived to Branch 3
StandardTruck 2000 unloaded packages at Branch 3
StandardTruck 2000 loaded packages at Branch 3
StandardTruck 2000 is on it's way to the HUB, time to arrive: 6
00:59
StandardTruck 2001 arrived to Branch 2
StandardTruck 2001 unloaded packages at Branch 2
StandardTruck 2001 loaded packages at Branch 2
StandardTruck 2001 is on it's way to the HUB, time to arrive: 5

========================== STOP ==========================



TRACKING NonStandardPackage [packageID=1000, priority=STANDARD, status=DELIVERED, startTime=, senderAddress=4-466320, destinationAddress=3-979005, width=237, length=458, height=119]
1: Customer, status=CREATION
1: NonStandardTruck 2004, status=COLLECTION
2: NonStandardTruck 2004, status=DISTRIBUTION
3: Customer, status=DELIVERED

TRACKING NonStandardPackage [packageID=1001, priority=STANDARD, status=CREATION, startTime=, senderAddress=0-279326, destinationAddress=4-230953, width=663, length=120, height=213]
6: Customer, status=CREATION

TRACKING StandardPackage [packageID=1002, priority=LOW, status=DELIVERED, startTime=, senderAddress=4-214283, destinationAddress=1-580249, weight=5.796479225158691]
11: Customer, status=CREATION
11: Van 2021, status=COLLECTION
15: Branch 4, status=BRANCH_STORAGE
24: StandardTruck 2002, status=HUB_TRANSPORT
26: HUB, status=HUB_STORAGE
31: StandardTruck 2002, status=BRANCH_TRANSPORT
40: Branch 1, status=DELIVERY
40: Van 2009, status=DISTRIBUTION
50: Customer, status=DELIVERED

TRACKING SmallPackage [packageID=1003, priority=LOW, status=DELIVERED, startTime=, senderAddress=0-1057564, destinationAddress=1-501399, acknowledge=false]
16: Customer, status=CREATION
16: Van 2005, status=COLLECTION
21: Branch 0, status=BRANCH_STORAGE
22: StandardTruck 2001, status=HUB_TRANSPORT
28: HUB, status=HUB_STORAGE
31: StandardTruck 2002, status=BRANCH_TRANSPORT
40: Van 2005, status=DISTRIBUTION
50: Customer, status=DELIVERED

TRACKING SmallPackage [packageID=1004, priority=HIGHT, status=DELIVERED, startTime=, senderAddress=1-545636, destinationAddress=0-670300, acknowledge=false]
21: Customer, status=CREATION
21: Van 2009, status=COLLECTION
28: Branch 1, status=BRANCH_STORAGE
40: StandardTruck 2002, status=HUB_TRANSPORT
44: HUB, status=HUB_STORAGE
48: StandardTruck 2002, status=BRANCH_TRANSPORT
51: Branch 0, status=DELIVERY
51: Van 2005, status=DISTRIBUTION
52: Customer, status=DELIVERED

TRACKING StandardPackage [packageID=1005, priority=HIGHT, status=DELIVERED, startTime=, senderAddress=3-863980, destinationAddress=2-469230, weight=4.6328020095825195]
26: Customer, status=CREATION
26: Van 2017, status=COLLECTION
27: Branch 3, status=BRANCH_STORAGE
28: StandardTruck 2002, status=HUB_TRANSPORT
31: HUB, status=HUB_STORAGE
33: StandardTruck 2001, status=BRANCH_TRANSPORT
42: Branch 2, status=DELIVERY
42: Van 2013, status=DISTRIBUTION
43: Customer, status=DELIVERED

TRACKING StandardPackage [packageID=1006, priority=STANDARD, status=DELIVERED, startTime=, senderAddress=4-770164, destinationAddress=4-1006520, weight=5.442949295043945]
31: Customer, status=CREATION
31: Van 2021, status=COLLECTION
36: Branch 4, status=BRANCH_STORAGE
41: StandardTruck 2000, status=HUB_TRANSPORT
43: HUB, status=HUB_STORAGE
47: StandardTruck 2003, status=BRANCH_TRANSPORT
52: Branch 4, status=DELIVERY
52: Van 2021, status=DISTRIBUTION
53: Customer, status=DELIVERED

TRACKING NonStandardPackage [packageID=1007, priority=STANDARD, status=DELIVERED, startTime=, senderAddress=2-828998, destinationAddress=3-391995, width=173, length=460, height=283]
36: Customer, status=CREATION
36: NonStandardTruck 2004, status=COLLECTION
45: NonStandardTruck 2004, status=DISTRIBUTION
46: Customer, status=DELIVERED

TRACKING SmallPackage [packageID=1008, priority=HIGHT, status=HUB_STORAGE, startTime=, senderAddress=4-1098997, destinationAddress=4-993421, acknowledge=true]
41: Customer, status=CREATION
41: Van 2021, status=COLLECTION
49: Branch 4, status=BRANCH_STORAGE
52: StandardTruck 2003, status=HUB_TRANSPORT
56: HUB, status=HUB_STORAGE

46: Customer, status=CREATION
46: Van 2022, status=COLLECTION
53: Branch 4, status=BRANCH_STORAGE
56: StandardTruck 2002, status=HUB_TRANSPORT
58: HUB, status=HUB_STORAGE

TRACKING NonStandardPackage [packageID=1010, priority=STANDARD, status=CREATION, startTime=, senderAddress=3-359855, destinationAddress=1-271216, width=579, length=406, height=71]
51: Customer, status=CREATION

TRACKING NonStandardPackage [packageID=1011, priority=HIGHT, status=CREATION, startTime=, senderAddress=2-1008027, destinationAddress=4-881538, width=898, length=311, height=94]
56: Customer, status=CREATION

	 * 
	 */

}
