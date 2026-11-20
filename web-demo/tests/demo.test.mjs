import test from 'node:test';
import assert from 'node:assert/strict';
import fs from 'node:fs';
import path from 'node:path';
import vm from 'node:vm';
import { fileURLToPath } from 'node:url';

const dir = path.dirname(fileURLToPath(import.meta.url));
test('demo-android web preview JS is valid and Java repository exists', () => {
  const html = fs.readFileSync(path.join(dir, '..', 'index.html'), 'utf8');
  const m = html.match(/<script>([\s\S]*?)<\/script>/);
  assert.ok(m);
  new vm.Script(m[1]);
  const java = fs.readFileSync(path.join(dir, '..', '..', 'app', 'NotesRepository.java'), 'utf8');
  assert.ok(java.includes('class NotesRepository'));
});
