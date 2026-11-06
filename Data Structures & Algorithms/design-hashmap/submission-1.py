class MyHashMap:

    def __init__(self):
        self.keys=[]
        self.values=[]
        

    def put(self, key: int, value: int) -> None:
        found = False
        for i in range(len(self.keys)):
            if self.keys[i]==key:
                self.values[i]=value
                found = True
        if found == False:
            self.keys.append(key)
            self.values.append(value)

    def get(self, key: int) -> int:
        for i in range(len(self.keys)):
            if self.keys[i]==key:
                return self.values[i]
        return -1
        

    def remove(self, key: int) -> None:
        for i in range(len(self.keys)):
            if self.keys[i]==key:
                del self.keys[i]
                del self.values[i]
                break
        


# Your MyHashMap object will be instantiated and called as such:
# obj = MyHashMap()
# obj.put(key,value)
# param_2 = obj.get(key)
# obj.remove(key)