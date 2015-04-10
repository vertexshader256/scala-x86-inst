package com.scalaAsm.x86
package Instructions
package x87

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Store x87 FPU Status Word
// Category: general/control

trait FNSTSW extends InstructionDefinition {
  val mnemonic = "FNSTSW"
}

object FNSTSW extends FNSTSW with ZeroOperands[FNSTSW] with OneOperand[FNSTSW] with FNSTSWImpl

trait FNSTSWImpl {
  self: FNSTSW =>
  implicit object FNSTSW_0 extends _1[m16] {
    val opcode: OneOpcode = 0xDD /+ 7
  }

  implicit object FNSTSW_1 extends _0 {
    val opcode: OneOpcode = 0xDF /+ 4
    override def hasImplicitOperand = true
  }
}
