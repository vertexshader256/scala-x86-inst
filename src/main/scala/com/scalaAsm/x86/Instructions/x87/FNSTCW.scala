package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Store x87 FPU Control Word
// Category: general/control

trait FNSTCW extends InstructionDefinition {
  val mnemonic = "FNSTCW"
}

object FNSTCW extends FNSTCW with OneOperand[FNSTCW] with FNSTCWImpl

trait FNSTCWImpl {
  self: FNSTCW =>
  implicit object FNSTCW_0 extends _1[m16] {
    val opcode: OneOpcode = 0xD9 /+ 7
  }
}
