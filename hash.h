#ifndef LIST_H
#define LIST_H

struct Node {
  void *data;
  Node *next;
};

class Hash {
public:
  Hash(int size, int (*getkey)(void *data));
  ~Hash(); // Destructor to free allocated memory
  void reset();
  void *insert(void *data);
  void *next();
  void *get(void *data);
  void *remove(void *data);
  bool isLinkedListEmpty();

private:
  int hashsize;
  Node **table;
  int index;
  int (*gethashkey)(void *data);
};

#endif // LIST_H
