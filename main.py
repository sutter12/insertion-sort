#Author: Alexander Sutter
#Date: 3/7/2022

#Insertion Sort

def insertionSort(list):
    for j in range(1,len(list)):
        key = list[j]
        #insert list[i] into the sorted sequence list[1.. j-1]
        i = j-1
        while i >= 0 and list[i] > key:
            list[i+1] = list[i]
            i = i - 1
        list[i+1] = key
    
    return list

def main():
    myList = [5,2,4,6,1,3] #unsorted list

    sortedList = insertionSort(myList) #pass myList into insertion-sort to be sorted

    print(sortedList) #print the sorted list



main()