#include "hash.h"
#include <iostream>

Hash::Hash(int size, int (*getkey)(void *data)) {
  hashsize = size;
  gethashkey = getkey;

  table = new Node *[hashsize];
  for (int i = 0; i < hashsize; i++) {
    table[i] = NULL;

  } // Initialize table with NULL pointers
}

Hash::~Hash() {
  reset(); // Call reset to free allocated memory
}

void Hash::reset() { index = 0; }

void *Hash::insert(void *data) {
  index = gethashkey(data) % hashsize;
  Node *temp = table[index];

  Node *newNode = new Node;
  newNode->data = data;
  newNode->next = nullptr;

  if (temp == nullptr) {
    table[index] = newNode;
  } else {
    // You need to traverse the linked list and append the new node
    while (temp->next != nullptr) {
      temp = temp->next;
    }
    temp->next = newNode;
  }
  return newNode;
}

void *Hash::next() {
  // Iterate through the elements in the hash table
  while (index < hashsize) {
    Node *current = table[index];

    // If the current node is not null, move to the next node
    if (current != nullptr) {
      index++; // Move to the next index for the next call
      return current->data;
    }

    index++; // Move to the next index
  }

  // Reset index if the end of the hash table is reached
  index = 0;
  return nullptr;
}



void *Hash::get(void *data) {
  int key = gethashkey(data);
  int i = key % hashsize;

  Node *current = table[i];
  while (current != nullptr) {
    // Compare keys or use another method to find the correct node
    // ...
    if (current->data == data) {
      return current->data;
    }
    current = current->next;
  }

  return nullptr; // Element not found
}

void *Hash::remove(void *data) {
  int key = gethashkey(data);
  int i = key % hashsize;

  Node *current = table[i];
  Node *prev = nullptr;

  while (current != nullptr) {
    // Compare keys or use another method to find the correct node
    // ...
    if (current->data == data) {
      if (prev == nullptr) {
        // Node to be removed is the first node in the list
        table[i] = current->next;
      } else {
        // Node to be removed is not the first node in the list
        prev->next = current->next;
      }
      void *removedData = current->data;
      delete current;
      return removedData;
    }

    prev = current;
    current = current->next;
  }

  return nullptr; // Element not found
}

bool Hash::isLinkedListEmpty() {
  for (int i = 0; i < hashsize; ++i) {
    if (table[i] != nullptr) {
      return false;
    }
  }
  return true;
}
