package com.scalaAsm.x86
package Instructions
package General

import com.scalaAsm.x86.Operands._
import com.scalaAsm.x86.Operands.Memory._

// Description: Set AL If Carry
// Category: general/datamov

trait SALC extends InstructionDefinition {
  val mnemonic = "SALC"
}

object SALC extends SALC with SALCImpl

trait SALCImpl {
  self: SALC =>
  implicit object SALC_0 extends _0 {
    val opcode: OneOpcode = 0xD6
    override def hasImplicitOperand = true
  }
}
